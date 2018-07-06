package FXControlExtensions;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.reflect.Method;

public final class DataGrid
{

    public static void AutoGenerateColumns(Class type, TableView table)
    {
        for(Method property : type.getMethods())
        {
            String name = property.getName();
            if(name.endsWith("Property"))
            {
                String propName = name.replace("Property", "");
                TableColumn column = new TableColumn(propName);
                column.setCellValueFactory(new PropertyValueFactory <>(propName));
                table.getColumns().add(column);
            }
        }
    }

}
