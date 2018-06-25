import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

import static Linq.Enumerable.*;


public class App extends Application
{

    public static void main(String[] args)
    {

        ArrayList<Integer> nums = new ArrayList <>();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++)
        {
            nums.add(i);
        }

        long endTime = System.currentTimeMillis();

        Iterable <Integer> output = SelectIterator(nums, x -> x * 2);

        output.forEach(x->System.out.println(x));
        System.out.println("That took " + ((endTime - startTime)) + " milliseconds");
    }

    @Override
    public void start(Stage primaryStage)
    {

    }


}