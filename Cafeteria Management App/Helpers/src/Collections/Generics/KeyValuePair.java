package Collections.Generics;

public class KeyValuePair<TKey, TValue>
{

    private TKey key;

    private TValue value;

    public KeyValuePair(TKey key, TValue value)
    {
        this.key = key;
        this.value = value;
    }

    public TKey Key()
    {
        return key;
    }

    public TValue Value()
    {
        return value;
    }

    public static <TKey, TValue> KeyValuePair <TKey, TValue> Create(TKey key, TValue value)
    {
        return new KeyValuePair <TKey, TValue>(key, value);
    }

}
