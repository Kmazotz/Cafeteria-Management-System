package Linq;

import java.util.List;
import java.util.function.Function;


public final class Enumerable
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

        return Enumerable. <TSource, TResult> SelectIterator(source, selector);

    }

    public static <TSource, TResult> Iterable <TResult> SelectIterator(Iterable <TSource> source, Function <TSource, TResult> selector)
    {

        List <TSource> list = (List <TSource>) source;

        list.parallelStream().forEach((x) -> selector.apply(x));
        return null;
    }

    public static void Join()
    {

    }

    public static void Last()
    {

    }

    public static void Range()
    {

    }

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

    public static void OrderBy(){

    }

    public static void OrderByDescending(){

    }

    public static void Pretend(){

    }

    public static void Repeat(){

    }

    public static void Reverse(){

    }

    public static void Min(){}

    public static void Max(){}

    public static void Take(){}

    public static void TakeWhile(){}

    public static void ThenBy(){

    }

    public static void Union(){}

    public static void Zip(){

    }
}
