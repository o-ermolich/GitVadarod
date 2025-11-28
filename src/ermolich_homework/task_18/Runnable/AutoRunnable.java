package ermolich_homework.task_18.Runnable;

public class AutoRunnable implements Runnable {
    private String name;
    private String stateNumber;
    private int stopTime;

    public AutoRunnable(String name, String stateNumber, int stopTime) {
        this.name = name;
        this.stateNumber = stateNumber;
        this.stopTime = stopTime;
    }

    public void run() {
        drive();
    }

    public void drive() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " с гос. номером " + stateNumber + " едет");
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                throw new RuntimeException("Ошибка");
            }
        }
    }
}
