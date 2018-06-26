package Collections.Generics;

import java.util.Iterator;

public interface IEnumerator<T>
{

    boolean MoveNext();

    T Current();

    Iterator <T> ToIterator();

    void Reset();

}
