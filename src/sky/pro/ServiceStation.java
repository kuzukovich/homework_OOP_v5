package sky.pro;

public class ServiceStation {
    public void check(Car car) {
        car.service();
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }
    public void check(Truck truck) {
        truck.service();
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();

    }
    public void check(Bicycle bicycle) {
        bicycle.service();
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

}