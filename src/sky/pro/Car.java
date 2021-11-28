package sky.pro;

public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку на машине");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель на машине");
    }

    public void service() {
        System.out.println("Обслуживаем машину " + getModelName());
    }
}