package Controllers;

import DataContext.AppContext;
import Entities.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class InventoryController implements Initializable
{

    @FXML
    private TableView <Product> productTable;

    @FXML
    private TableColumn <Product, Integer> idColumn;

    @FXML
    private TableColumn <Product, String> referenceCodeColumn;

    @FXML
    private TableColumn <Product, String> nameColumn;

    @FXML
    private TableColumn <Product, String> descriptionColumn;

    @FXML
    private TableColumn <Product, Integer> inventoryMinColumn;

    @FXML
    private TableColumn <Product, BigDecimal> priceInColumn;

    @FXML
    private TableColumn <Product, BigDecimal> priceOutColumn;

    @FXML
    private TableColumn <Product, Integer> unitsColumn;

    @FXML
    private TableColumn <Product, String> categoryColumn;

    @FXML
    private TableColumn <Product, Date> creationDateColumn;

    @FXML
    private TableColumn <Product, Boolean> isActiveColumn;


    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button modifyButton;


    private AppContext context = new AppContext();

    public InventoryController()
    {
    }


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        InitializeColumns();
        productTable.setItems(context.Products());

    }


    private final void InitializeColumns()
    {
        idColumn.setCellValueFactory(cell -> cell.getValue().IDProperty().asObject());

        referenceCodeColumn.setCellValueFactory(cell -> cell.getValue().ReferenceCodeProperty());

        nameColumn.setCellValueFactory(cell -> cell.getValue().NameProperty());

        descriptionColumn.setCellValueFactory(cell -> cell.getValue().DescriptionProperty());

        inventoryMinColumn.setCellValueFactory(cell -> cell.getValue().InventoryMinProperty().asObject());

        priceInColumn.setCellValueFactory(cell -> cell.getValue().PriceInProperty());

        priceOutColumn.setCellValueFactory(cell -> cell.getValue().PriceOutProperty());

        unitsColumn.setCellValueFactory(cell -> cell.getValue().UnitsProperty().asObject());

        categoryColumn.setCellValueFactory(cell -> cell.getValue().CategoryProperty());

        creationDateColumn.setCellValueFactory(cell -> cell.getValue().CreationDateProperty());

        isActiveColumn.setCellValueFactory(cell -> cell.getValue().IsActiveProperty());
    }

    @FXML
    private void OnClickAddButton(ActionEvent e)
    {
        context.Products().add(Product.CreateEmpty());
    }

    @FXML
    private void OnClickDeleteButton(ActionEvent e)
    {
        context.Products().remove(productTable.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void OnClickModifyButton(ActionEvent e)
    {
        context.Products().set(productTable.getSelectionModel().getSelectedIndex(), Product.CreateEmpty());
    }
}
