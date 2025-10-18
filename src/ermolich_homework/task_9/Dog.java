package ermolich_homework.task_9;

public class Dog extends Animal{
    private String name;
    private String breed;
    private double weight;

    public Dog(String color, int maxYear, String food, String name, String breed, double weight) {
        super(color, maxYear, food);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void Sound() {
        System.out.println(name + " лает");
    }

    public void Bite() {
        System.out.println(name + " кусает");
    }

    public void Run() {
        System.out.println(name + " бегает");
    }

    public void Play() {
        System.out.println(name + " играет");
    }

    public void Jump() {
        System.out.println(name + " прыгает");
    }

    public String info() {
        String info = " имя: " + name + " порода: " + breed + " максимальный вес: " + breed + super.info();
        return info;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if (name.equals(dog.getName()) && breed.equals(dog.getBreed()) && weight == dog.getWeight()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (int) (name.hashCode() + breed.hashCode() + weight);
        return result;
    }
}
