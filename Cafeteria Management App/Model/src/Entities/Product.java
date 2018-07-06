package Entities;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class Product
{

    private SimpleIntegerProperty id;

    private SimpleStringProperty referenceCode;

    private SimpleStringProperty name;

    private SimpleStringProperty description;

    private SimpleIntegerProperty inventoryMin;

    private SimpleObjectProperty <BigDecimal> priceIn;

    private SimpleObjectProperty <BigDecimal> priceOut;

    private SimpleIntegerProperty units;

    private SimpleStringProperty category;

    private SimpleObjectProperty <Date> creationDate;

    private SimpleBooleanProperty isActive;

    public Product()
    {
        this.id = new SimpleIntegerProperty();
        this.priceOut = new SimpleObjectProperty <BigDecimal>();
        this.priceIn = new SimpleObjectProperty <BigDecimal>();
        this.category = new SimpleStringProperty();
        this.inventoryMin = new SimpleIntegerProperty();
        this.description = new SimpleStringProperty();
        this.name = new SimpleStringProperty();
        this.units = new SimpleIntegerProperty();
        this.isActive = new SimpleBooleanProperty();
        this.creationDate = new SimpleObjectProperty <Date>();
        this.referenceCode = new SimpleStringProperty();
    }


    public int ID() { return id.get(); }

    public void ID(int value) {id.set(value);}

    public SimpleIntegerProperty IDProperty() { return id;}

    public String Name() {return name.get();}

    public void Name(String value) {name.set(value);}

    public SimpleStringProperty NameProperty() {return name;}

    public String ReferenceCode() { return referenceCode.get(); }

    public SimpleStringProperty ReferenceCodeProperty() { return referenceCode; }

    public void ReferenceCode(String value) { this.referenceCode.set(value); }

    public String Description() { return description.get(); }

    public SimpleStringProperty DescriptionProperty() { return description; }

    public void Description(String value) { this.description.set(value); }

    public int InventoryMin() { return inventoryMin.get(); }

    public SimpleIntegerProperty InventoryMinProperty() { return inventoryMin; }

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

    public SimpleIntegerProperty UnitsProperty()
    {
        return units;
    }

    public void Units(int value)
    {
        this.units.set(value);
    }

    public String Category()
    {
        return category.get();
    }

    public SimpleStringProperty CategoryProperty()
    {
        return category;
    }

    public void Category(String value)
    {
        this.category.set(value);
    }

    public Date CreationDate()
    {
        return creationDate.get();
    }

    public SimpleObjectProperty <Date> CreationDateProperty()
    {
        return creationDate;
    }

    public void CreationDate(Date value)
    {
        this.creationDate.set(value);
    }

    public boolean IsActive()
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

    public static Product CreateEmpty()
    {
        Product product = new Product();

        product.id.set(0);

        product.referenceCode.set(UUID.randomUUID().toString());

        product.name.set("product ABDC");

        product.creationDate.set(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));

        product.isActive.set(false);

        product.units.set(1);

        product.description.set("Description for product");

        product.inventoryMin.set(4);

        product.category.set("1A");

        product.priceIn.set(BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(1, 100000)));

        product.priceOut.set(BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(1, 100000)));

        return product;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
