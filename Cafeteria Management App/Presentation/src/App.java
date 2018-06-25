import javafx.application.Application;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App extends Application
{

    public static void main(String[] args)
    {

        ArrayList <Integer> nums = new ArrayList <>();
        long startTime = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            nums.add(i);
        }

        long endTime = System.currentTimeMillis();

        ArrayList <Integer> results = Select(nums, (Integer x)->x*2);



        System.out.println("That took " + ((endTime - startTime)) + " milliseconds");
    }

    @Override
    public void start(Stage primaryStage)
    {

    }

    public static <in, out> ArrayList <out> Select(List <in> list, Function <in, out> selector)
    {

        List <out> results = new ArrayList();
        list.forEach(x -> results.add(selector.apply(x)));
        return (ArrayList <out>) results;
    }
}
