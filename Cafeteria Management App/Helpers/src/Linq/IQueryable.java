package Linq;

import Linq.Expressions.Expression;

public interface IQueryable extends Iterable
{

    Expression Expression();

    IQueryProvider Provider();

    Class ElementType();
}
