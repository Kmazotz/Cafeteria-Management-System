package Linq;

import Collections.Generics.IEnumerable;
import Collections.Generics.IEnumerator;

import java.util.Iterator;

final class RangeIterator<T> implements IEnumerable <Integer>, IEnumerator<Integer>
{
    private int state;

    private int current;

    private int initialThreadId;

    public RangeIterator(int id) {}


    @Override
    public Collections.IEnumerator <Integer> GetEnumerator()
    {
        return null;
    }

    @Override
    public Iterable <Integer> ToIterable()
    {
        return null;
    }

    @Override
    public boolean MoveNext()
    {
        return false;
    }

    @Override
    public Integer Current()
    {
        return null;
    }

    @Override
    public Iterator <Integer> ToIterator()
    {
        return null;
    }

    @Override
    public void Reset()
    {

    }
}
