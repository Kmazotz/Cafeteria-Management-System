package Collections.Generics;

import Collections.IEnumerator;

import java.util.Arrays;
import java.util.function.Predicate;

public class List<T> implements IEnumerable <T>, IList <T>, IReadOnlyCollection <T>, IReadOnlyList <T>
{
    private static Object[] _emptyArray;

    static
    {
        _emptyArray = new Object[ 1 ];
    }

    private final int _defaultCapacity = 4;
    private T[] _items;
    private int _size;
    private int _version;

    public List()
    {

    }

    public List(int capacity)
    {
        if(capacity < 0)
        {
            throw new IllegalArgumentException();
        }

        if(capacity == 0)
        {
            this._items = (T[]) List._emptyArray;
        }
        else
        {
            this._items = (T[]) new Object[ capacity ];
        }
    }

    @Override
    public int IndexOf(T item)
    {
        return 0;
    }

    @Override
    public void Insert(int index, T item)
    {

    }

    @Override
    public void RemoveAt(int index)
    {

    }

    @Override
    public T Get(int index)
    {
        return null;
    }

    @Override
    public void Set(int index, T value)
    {

    }

    @Override
    public void Add(T item)
    {
        if(this._size == this._items.length)
        {
            this.EnsureCapacity(this._size + 1);
        }
        int index = this._size;
        this._size = index + 1;
        this._items[ index ] = item;
        this._version++;

    }

    private void EnsureCapacity(int min)
    {
        if(this._items.length < min)
        {
            int num = (this._items.length == 0) ? 4 : (this._items.length * 2);
            if(num > 0x7fefffff)
            {
                num = 0x7fefffff;
            }
            if(num < min)
            {
                num = min;
            }
            this.Capacity(num);
        }
    }

    public int Capacity()
    {
        return _items.length;
    }

    public void Capacity(int value)
    {

        if(value < this._size)
        {
            throw new IllegalArgumentException();
        }
        if(value != this._items.length)
        {
            if(value > 0)
            {
                T[] destinationArray = (T[]) new Object[ value ];
                if(this._size > 0)
                {
                    System.arraycopy(this._items, 0, destinationArray, 0, this._size);
                }
                this._items = destinationArray;
            }
            else
            {
                this._items = (T[]) _emptyArray;
            }
        }
    }

    public T[] ToArray()
    {
        T[] destinationArray = (T[]) new Object[ this._size ];
        System.arraycopy(this._items, 0, destinationArray, 0, this._size);
        return destinationArray;
    }

    public T Find(Predicate <T> match)
    {
        if(match == null)
        {
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < this._size; i++)
        {
            if(match.test(this._items[ i ]))
            {
                return this._items[ i ];
            }
        }
        return null;
    }


    public List <T> FindAll(Predicate <T> match)
    {
        if(match == null)
        {
            throw new IllegalArgumentException();
        }
        List <T> list = new List <T>();
        for(int i = 0; i < this._size; i++)
        {
            if(match.test(this._items[ i ]))
            {
                list.Add(this._items[ i ]);
            }
        }
        return list;
    }


    public void AddRange(IEnumerable <T> collection)
    {
        this.InsertRange(this._size, collection);
    }

    public void InsertRange(int index, IEnumerable <T> collection)
    {
        if(collection == null)
        {
            throw new IllegalArgumentException();
        }

        if(index > this._size)
        {
            throw new IllegalArgumentException();
        }

        ICollection <T> is2 = (ICollection <T>) collection;

        if(is2 != null)
        {
            int count = is2.Count();
            if(count > 0)
            {
                this.EnsureCapacity(this._size + count);
                if(index < this._size)
                {
                    System.arraycopy(this._items, index, this._items, index + count, this._size - index);
                }
                if(this == is2)
                {
                    System.arraycopy(this._items, 0, this._items, index, index);
                    System.arraycopy(this._items, (int) (index + count), this._items, (int) (index * 2), (int) (this._size - index));
                }
                else
                {
                    T[] array = (T[]) new Object[ count ];
                    is2.CopyTo(array, 0);
                    Arrays.copyOf(this._items, index);

                }
                this._size += count;
            }
        }
        else
        {
            IEnumerator <T> enumerator = collection.GetEnumerator();
            while(enumerator.MoveNext())
            {
                this.Insert(index++, enumerator.Current());
            }
        }
        this._version++;
    }


    @Override
    public void Clear()
    {

    }

    @Override
    public boolean Contains(T item)
    {
        return false;
    }

    @Override
    public void CopyTo(T[] array, int arrayIndex)
    {

    }

    @Override
    public boolean Remove(T item)
    {
        return false;
    }

    @Override
    public int Count()
    {
        return 0;
    }

    @Override
    public boolean IsReadOnly()
    {
        return false;
    }

    @Override
    public IEnumerator <T> GetEnumerator()
    {
        return null;
    }

    @Override
    public Iterable <T> ToIterable()
    {
        return null;
    }
}
