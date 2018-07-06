package DataContext;

import Entities.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppContext
{

    ObservableList <Product> products = FXCollections.observableArrayList();

    public AppContext()
    {
        for(int i = 0; i < 100; i++)
        {
            products.add(Product.CreateEmpty());
        }
    }

    public ObservableList <Product> Products()
    {
        return products;
    }

    public void Products(ObservableList <Product> value)
    {
        products = value;
    }

}
