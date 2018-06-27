package Entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.math.BigDecimal;

public final class Product
{
    private SimpleStringProperty referenceCode = new SimpleStringProperty();

    private SimpleStringProperty name = new SimpleStringProperty();

    private SimpleStringProperty description = new SimpleStringProperty();

    private SimpleIntegerProperty inventoryMin = new SimpleIntegerProperty();

    private SimpleObjectProperty <BigDecimal> priceIn = new SimpleObjectProperty <>();

    private SimpleObjectProperty <BigDecimal> priceOut = new SimpleObjectProperty <>();

    private SimpleIntegerProperty units = new SimpleIntegerProperty();

    private SimpleStringProperty Category = new SimpleStringProperty();

    private SimpleBooleanProperty isActive = new SimpleBooleanProperty();

    public Product()
    {
        name.addListener((value, oldVal, newVal) -> System.out.println("name has changed!"));
    }

    public String ReferenceCode()
    {
        return referenceCode.get();
    }

    public SimpleStringProperty ReferenceCodeProperty()
    {
        return referenceCode;
    }

    public void ReferenceCode(String value)
    {
        this.referenceCode.set(value);
    }

    public String Name()
    {
        return name.get();
    }

    public SimpleStringProperty NameProperty()
    {
        return name;
    }

    public void Name(String value)
    {
        this.name.set(value);
    }

    public String Description()
    {
        return description.get();
    }

    public SimpleStringProperty DescriptionProperty()
    {
        return description;
    }

    public void Description(String value)
    {
        this.description.set(value);
    }

    public int InventoryMin()
    {
        return inventoryMin.get();
    }

    public SimpleIntegerProperty InventoryMinProperty()
    {
        return inventoryMin;
    }

    public void InventoryMin(int value)
    {
        this.inventoryMin.set(value);
    }

    public BigDecimal PriceIn()
    {
        return priceIn.get();
    }

    public SimpleObjectProperty <BigDecimal> PriceInProperty()
    {
        return priceIn;
    }

    public void PriceIn(BigDecimal value)
    {
        this.priceIn.set(value);
    }

    public BigDecimal PriceOut()
    {
        return priceOut.get();
    }

    public SimpleObjectProperty <BigDecimal> PriceOutProperty()
    {
        return priceOut;
    }

    public void PriceOut(BigDecimal value)
    {
        this.priceOut.set(value);
    }

    public int Units()
    {
        return units.get();
    }

    public SimpleIntegerProperty unitsProperty()
    {
        return units;
    }

    public void Units(int value)
    {
        this.units.set(value);
    }

    public String Category()
    {
        return Category.get();
    }

    public SimpleStringProperty CategoryProperty()
    {
        return Category;
    }

    public void Category(String value)
    {
        this.Category.set(value);
    }

    public boolean isIsActive()
    {
        return isActive.get();
    }

    public SimpleBooleanProperty IsActiveProperty()
    {
        return isActive;
    }

    public void IsActive(boolean value)
    {
        this.isActive.set(value);
    }


}
