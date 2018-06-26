package Linq.Generics;

import Linq.Expressions.Expression;
import Linq.IQueryProvider;

public interface IQueryable<T> extends Iterable<T>
{

    Expression Expression();

    IQueryProvider Provider();

    Class ElementType();

    Linq.IQueryable ToQueryable();
}
