package ermolich_homework.task_11;

public class Cook implements Robot {
    private String model;
    private int power;
    private String country;
    private String unit;
    private boolean isOn;

    public Cook(String model, int power, String country, String unit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.unit = unit;
        this.isOn = isOn;
    }

    @Override
    public void on() {
        System.out.println("Робот " + model + " включён");
    }

    @Override
    public void off() {

    }

    @Override
    public void uniquePossibility() {
        System.out.println("Повар спрашивает повара");
    }
}