package ermolich_homework.Task_12;

public class Vehicle {
    private String name;
    private int emissions;

    public Vehicle(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }
}
