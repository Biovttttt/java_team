

import java.io.FileWriter;
import java.io.IOException;

public class Driver {


    //public static final Path WRITE_PATH= Paths.get("jsonCar.json");

    private int id;
    private String driverName;
    private Status status =null;
    private String bus;

    public Driver() {
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public Driver(int id, String driverName, String bus) {
        this.id = id;
        this.driverName = driverName;
        this.bus = bus;
    }

    public Status getStatus(int id) {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId(int id_driver) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return " " + id +
                " |  " + driverName +
                "    |  " + bus;
    }

    public static void getDriverJson(String json){
        try(FileWriter fileWriter=new FileWriter("jsonDriver.json")) {
            fileWriter.write(json);
        } catch (IOException e) {
            System.out.println("error");
        }


//        try(FileReader fileReader=new FileReader("jsonDriver.json")) {
//            Scanner sc=new Scanner(fileReader);
//            while (sc.hasNextLine()){
//                System.out.println(sc.nextLine());
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
