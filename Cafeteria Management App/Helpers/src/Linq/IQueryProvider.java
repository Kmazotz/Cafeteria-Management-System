package Linq;

import Linq.Expressions.Expression;

public interface IQueryProvider
{


    IQueryable CreateQuery(Expression expression);

    <TElement> Linq.Generics.IQueryable <TElement> CreateQuery();

    //Object Execute(Expression expression);

    <TResult> TResult Execute(Expression expression);


}
