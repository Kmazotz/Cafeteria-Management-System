package Collections.Generics;

import Collections.IEnumerator;

public class Dictionary<TKey, TValue> implements IDictionary<TKey,TValue>
{

    @Override
    public void Add(TKey tKey, TValue tValue)
    {

    }

    @Override
    public boolean ContainsKey(TKey tKey)
    {
        return false;
    }

    @Override
    public boolean TryGetValue(TKey tKey)
    {
        return false;
    }

    @Override
    public ICollection <TKey> Keys()
    {
        return null;
    }

    @Override
    public ICollection <TValue> Values()
    {
        return null;
    }

    @Override
    public TValue Get(TKey tKey)
    {
        return null;
    }

    @Override
    public void Set(TKey tKey, TValue tValue)
    {

    }

    @Override
    public void Add(KeyValuePair <TKey, TValue> item)
    {

    }

    @Override
    public void Clear()
    {

    }

    @Override
    public boolean Contains(KeyValuePair <TKey, TValue> item)
    {
        return false;
    }

    @Override
    public void CopyTo(KeyValuePair <TKey, TValue>[] array, int arrayIndex)
    {

    }

    @Override
    public boolean Remove(KeyValuePair <TKey, TValue> item)
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
    public IEnumerator <KeyValuePair <TKey, TValue>> GetEnumerator()
    {
        return null;
    }

    @Override
    public Iterable <KeyValuePair <TKey, TValue>> ToIterable()
    {
        return null;
    }
}
