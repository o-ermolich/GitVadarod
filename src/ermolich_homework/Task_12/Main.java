package ermolich_homework.Task_12;

public class Main {
    public static void main(String[] args) {
        Garage <Car> carGarage = new Garage<>();
        Car car = new Car("Toyota", 95);
        carGarage.parkVehicle(car);

        System.out.println("Транспортное средство в гараже для автомобилей: " + carGarage.getVehicle().getName());
        if (carGarage.isEntryPermitted()) {
            System.out.println("Разрешен ли въезд? Да");
        } else {
            System.out.println("Разрешен ли въезд? Нет");
        }

        Garage<Motorcycle> motorcycleGarage = new Garage<>();
        Motorcycle motorcycle = new Motorcycle("Yamaha", 100);
        motorcycleGarage.parkVehicle(motorcycle);

        System.out.println("Транспортное средство в гараже для мотоциклов: " + motorcycleGarage.getVehicle().getName());
        if (motorcycleGarage.isEntryPermitted()) {
            System.out.println("Разрешен ли въезд? Да");
        } else {
            System.out.println("Разрешен ли въезд? Нет");
        }
    }
}
