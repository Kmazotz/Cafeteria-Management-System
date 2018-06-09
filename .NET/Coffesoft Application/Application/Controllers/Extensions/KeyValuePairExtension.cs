using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataServices.Extensions
{
    public static class KeyValuePairExtension
    {
        public static (T1, T2) ToTuple<T1, T2>(this KeyValuePair<T1, T2> keyValuePair)
        {
            return (keyValuePair.Key, keyValuePair.Value);
        }

        public static KeyValuePair<TKey, TValue> ToKeyValue<TKey, TValue>(this ValueTuple<TKey, TValue> valueTuple)
        {
            return new KeyValuePair<TKey, TValue>(valueTuple.Item1, valueTuple.Item2);
        }
    }
}
