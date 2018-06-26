package Linq;

import Collections.Generics.IEnumerable;
import Collections.Generics.IEnumerator;

import java.util.function.Function;

public abstract class Iterator<TSource> implements IEnumerable <TSource>, IEnumerator <TSource>
{
    private int threadId;

    int state;

    TSource current;

    public Iterator()
    {
        threadId = (int) Thread.currentThread().getId();
    }

    public abstract Iterator Clone();

    public abstract <TResult> IEnumerable <TResult> Select(Function <TSource, TResult> selector);

    public abstract <TSource> IEnumerable Where(Function <TSource, Boolean> predicate);


    @Override
    public Collections.IEnumerator <TSource> GetEnumerator()
    {
        if(threadId == Thread.currentThread().getId() && state == 0)
        {
            this.state = 1;
            return this.GetEnumerator();
        }

        Iterator <TSource> iterator = this.Clone();

        iterator.state = 1;

        return iterator.GetEnumerator();
    }

    @Override
    public abstract Iterable <TSource> ToIterable();

    @Override
    public abstract boolean MoveNext();

    @Override
    public abstract TSource Current();

    @Override
    public abstract java.util.Iterator <TSource> ToIterator();

    @Override
    public abstract void Reset();

}



