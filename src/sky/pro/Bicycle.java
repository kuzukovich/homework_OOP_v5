package sky.pro;

public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на велосипеде");
    }

    public void service() {
        System.out.println("Обслуживаем велосипед " + getModelName());
    }
}
