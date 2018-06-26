package Linq;

import Collections.Generics.IEnumerable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;


public class Enumerable
{

    public static <TSource, TResult> Iterable <TResult> Select(Iterable <TSource> source, Function <TSource, TResult> selector)
            throws IllegalArgumentException
    {
        if(source == null)
        {
            throw new IllegalArgumentException("source");
        }

        if(selector == null)
        {
            throw new IllegalArgumentException("selector");
        }

        return SelectIterator(source, selector);

    }

    static <TSource, TResult> Iterable <TResult> SelectIterator(Iterable <TSource> source, Function <TSource, TResult> selector)
    {
        List <TResult> out = new ArrayList();

        for(TSource element : source)
        {
            out.add(selector.apply(element));
        }

        return out;
    }

    public static void Join()
    {

    }

    public static void Concat() {}

    public static void Last()
    {

    }

    public static void Distinc() {}

    public static void Except() {}

    public static IEnumerable <Integer> Range(int start, int count)
    {
        long num = (start + count) - 1L;
        if((count < 0) || (num > 0x7fffffffL))
        {
            throw new IllegalArgumentException("selector");
        }
        return RangeIterator(start, count);

    }

    private static IEnumerable <Integer> RangeIterator(int start, int count)
    {
        return new RangeIterator <Integer>(-2);
    }

    public static void Append() {}

    public static void SequenceEqual()
    {

    }

    public static void SingleOrDefault()
    {

    }

    public static void Single()
    {

    }

    public static void Skip() {}

    public static void SkipWhile() {}

    public static void Where()
    {
    }

    public static void SelectAll()
    {

    }

    public static void SelectMany()
    {

    }

    public static void All() {}

    public static void Any() {}

    public static void Average() {}

    public static void Cast() {}

    public static void Contains() {}

    public static void GroupBy()
    {

    }

    public static void First() {}

    public static void FirstOrDefault()
    {

    }

    public static void GroupJoin() {}

    public static void Intersect()
    {

    }

    public static void OrderBy()
    {

    }

    public static void OrderByDescending()
    {

    }

    public static void Pretend()
    {

    }

    public static void Repeat()
    {

    }

    public static void Reverse()
    {

    }

    public static void Min() {}

    public static void Max() {}

    public static void Take() {}

    public static void TakeWhile() {}

    public static void ThenBy()
    {

    }

    public static void Union() {}

    public static void Zip()
    {

    }
}
