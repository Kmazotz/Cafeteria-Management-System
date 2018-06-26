package Collections;

import java.util.Iterator;

public interface IEnumerator<T>
{

    boolean MoveNext();

    T Current();

    Iterator ToIterator();

    void Reset();
}
