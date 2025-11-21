package ermolich_homework.task_18;

public class Main {
    public static void main(String[] args) {
        startCars();
    }

    private static void startCars() {
        Auto car1 = new Auto("BMW", "A123BC", 1000);
        Auto car2 = new Auto("Toyota", "B234CD", 2000);
        Auto car3 = new Auto("Land Rover", "C345DE", 3000);

        car1.start();
        try {
            car1.join();

            car2.start();
            car3.start();

            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Ошибка");
        }

        System.out.println("Все машины закончили движение");
    }
}
