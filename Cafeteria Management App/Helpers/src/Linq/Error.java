package Linq;

class Error
{
    static Exception ArgumentNull(String paramName)
    {
        return new IllegalArgumentException(paramName);
    }

    static Exception ArgumentArrayHasTooManyElements(String paramName)
    {
        return new IllegalArgumentException(paramName);
    }

}
