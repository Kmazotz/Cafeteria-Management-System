package Collections.Generics;

import Collections.IEnumerator;

public interface IEnumerable<T>
{

    IEnumerator <T> GetEnumerator();

    Iterable <T> ToIterable();
}
