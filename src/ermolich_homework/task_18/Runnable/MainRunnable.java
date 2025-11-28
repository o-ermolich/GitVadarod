package ermolich_homework.task_18.Runnable;

public class MainRunnable {
    public static void main(String[] args) {
        startCars();
    }

    private static void startCars() {

        AutoRunnable car1 = new AutoRunnable("Skoda", "A123BC", 1000);
        AutoRunnable car2 = new AutoRunnable("Lada", "B234CD", 2000);
        AutoRunnable car3 = new AutoRunnable("Jaguar", "C345DE", 3000);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);


        thread1.start();
        try {
            thread1.join();

            thread2.start();
            thread3.start();

            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Ошибка");
        }

        System.out.println("Все машины закончили движение");
    }
}
