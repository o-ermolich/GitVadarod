package ermolich_homework.Task_12;

public class Garage <T extends Vehicle> {
    private T Vehicle;

    public void parkVehicle(T vehicle) {
        this.Vehicle = vehicle;
    }

    public boolean isEntryPermitted() {
        if (Vehicle.getEmissions() > 100) {
            return false;
        } else {
            return true;
        }
    }

    public T getVehicle() {
        return Vehicle;
    }
}
