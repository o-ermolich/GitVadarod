package ermolich_homework.task_11;

public class Builder implements Robot, Engineer {
    private String model;
    private int power;
    private String country;
    private String equipmentBuild;
    private String material;
    private boolean isOn;

    public Builder(String model, String country, int power, String equipmentBuild, String material, boolean isOn) {
        this.model = model;
        this.country = country;
        this.power = power;
        this.equipmentBuild = equipmentBuild;
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
        System.out.println("Строитель строит");

    }

    @Override
    public void createItem() {
        System.out.println("Робот созадёт приспособление для разминирования");
    }
}
