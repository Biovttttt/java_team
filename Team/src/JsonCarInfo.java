import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonCarInfo {
    private int id;
    private String carName;
    private String driver;
    private Status state;

    public JsonCarInfo(int id, String carName, String driver, Status state) {
        this.id = id;
        this.carName = carName;
        this.driver = driver;
        this.state = state;

    }

    public JsonCarInfo() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                " " + id +
                "  | " + carName  +
                " |   " + driver  +
                "     |  " + state;
    }
        public static void getCarJson(String json){
            try(FileWriter fileWriter=new FileWriter("jsonCar.json")) {
                fileWriter.write(json);
            } catch (IOException e) {
                System.out.println("error");
            }

        }
    }




