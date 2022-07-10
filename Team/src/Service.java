import java.util.List;

public interface Service {


    void changeDriver(List<JsonCarInfo> jsonCarInfo, List<Driver> driver, int id_truck, int id_driver);
    void startDriving(List<JsonCarInfo> jsonCarInfo, int id_truck);
    void startRepair(List<JsonCarInfo> jsonCarInfo, int id_truck);

}

