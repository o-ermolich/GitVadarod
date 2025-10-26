package ermolich_homework.task_11;

public class Deminer implements Robot, Engineer {
    private String model;
    private int power;
    private String equipment;
    private String material;
    private boolean isOn;

    public Deminer(String model, int power, String equipment, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.equipment = equipment;
        this.material = material;
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
        System.out.println("Происходит разминирование");

    }

    public void repair() {
        System.out.println("Робот " + model + " отремонтирован");
    }

    @Override
    public void createItem() {
        System.out.println("Робот создаёт бетон");
    }
}