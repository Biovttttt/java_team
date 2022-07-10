
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder GSON_BUILDER=new GsonBuilder();
    public static final Gson GSON=GSON_BUILDER.setPrettyPrinting().create();
    public static void main(String[] args)  {


        List<JsonCarInfo> car=new ArrayList<>(Arrays.asList(
                new JsonCarInfo(1,"Renault","",Status.BASE),
                new JsonCarInfo(2,"Toyota ","",Status.BASE),
                new JsonCarInfo(3,"Subaru ","",Status.BASE)
        ));

        List<Driver> drivers = new ArrayList<>(Arrays.asList(
                new Driver(1,"Petr", null),
                new Driver(2,"Ivan", null),
                new Driver(3,"Ulan", null)
        ));

        String json=GSON.toJson(car);
        JsonCarInfo.getCarJson(json);
        System.out.println("---------------------------");
        String carJson = GSON.toJson(drivers);
        Driver.getDriverJson(carJson);
    }
}