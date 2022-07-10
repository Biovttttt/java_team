
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
        Scanner scanner=new Scanner(System.in);
        Station station=new Station();
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


        while (true) {
            System.out.println("     #    |  Driver  |  Bus  ");
            System.out.println("----------+----------+----------");
            for (Driver driver : drivers) {
                System.out.println(driver.toString());
            }
            System.out.println("-----+----------+---------------\n");
            System.out.println("                Trucks             ");
            System.out.println(" #  |  Car    | Driver |   State ");
            System.out.println("----+---------+-----------+----------");
            for (JsonCarInfo carInfo : car) {
                System.out.println(carInfo);
            }
            System.out.println("Выберите девствие \n" +
                    "1   Chang \n" +
                    "2   StartDriving \n" +
                    "3   StartRepair \n" +
                    "4   Information ");

                int scanner_id = scanner.nextInt();
                switch (scanner_id){
                    case 1:
                        System.out.println("Выберите тruck Лист");
                        int a = scanner.nextInt();
                        System.out.println(car.get(a).toString());
                        System.out.println("Выберите Водитель");
                        int b = scanner.nextInt();
                        station.changeDriver(car,drivers,a,b);
                        break;
                    case 2:
                        System.out.println("Выберите тruck Лист");
                        int aa = scanner.nextInt();
                        station.startDriving(car,aa);
                        break;
                    case 3:
                        System.out.println("Выберите тruck Лист");
                        int aaa = scanner.nextInt();
                        station.startRepair(car,aaa);
                        break;
                    case 4:
                        System.out.println("Выберите id Грузовика");
                        int tt = scanner.nextInt();
                        if (tt<=car.size()) {
                            System.out.println(car.get(tt).toString());
                            System.out.println();
                        }else
                        {
                            System.err.println("id с таким грузовиком  не сущетсвует!!!");
                        }
                }


        }
    }
}