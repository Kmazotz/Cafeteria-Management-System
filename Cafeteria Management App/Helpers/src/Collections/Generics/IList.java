package Collections.Generics;

public interface IList<T> extends IEnumerable <T>, ICollection <T>
{

    int IndexOf(T item);

    void Insert(int index, T item);

    void RemoveAt(int index);

    T Get(int index);

    void Set(int index, T value);
}
