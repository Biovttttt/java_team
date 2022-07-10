import java.util.List;

public class Station implements Service {

    List<JsonCarInfo> truck_list;
    List<Driver> driver_list;
    Driver driver_ob=new Driver();
    String Name;
    int driver_id;

    @Override
    public void changeDriver(List<JsonCarInfo> jsonCarInfo, List<Driver> driver, int id_truck, int id_driver) {
        truck_list=jsonCarInfo;
        driver_list=driver;

        if(driver_list.get(id_driver).getBus()!=null){
            System.out.printf("Водитель не свободен, выберите другого водителя");
        }
        else{
            String name_driver=driver.get(id_driver).getDriverName();
            String Bus=truck_list.get(id_truck).getCarName();
            truck_list.get(id_truck).setDriver(name_driver);
            driver_list.get(id_driver).setBus(Bus);
        }
    }

    @Override
    public void startDriving(List<JsonCarInfo> jsonCarInfo, int id_truck) {
        truck_list=jsonCarInfo;
        if(truck_list.get(id_truck).getState()==Status.REPAIR){
            System.err.print("===============Грузовик на ремонте ======================");

        }else {
            truck_list.get(id_truck).setState(Status.ROUTE);
        }

    }

    @Override
    public void startRepair(List<JsonCarInfo> jsonCarInfo, int id_truck) {
        truck_list=jsonCarInfo;
        truck_list.get(id_truck).setState(Status.REPAIR);
    }
}

