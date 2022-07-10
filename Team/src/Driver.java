

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {

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

    }
}
