package Collections.Generics;

public interface IDictionary<TKey, TValue> extends IEnumerable <KeyValuePair <TKey, TValue>>, ICollection <KeyValuePair <TKey, TValue>>
{
    void Add(TKey key, TValue value);

    boolean ContainsKey(TKey key);

    boolean TryGetValue(TKey key);

    ICollection <TKey> Keys();

    ICollection <TValue> Values();

    TValue Get(TKey key);

    void Set(TKey key, TValue value);

}
