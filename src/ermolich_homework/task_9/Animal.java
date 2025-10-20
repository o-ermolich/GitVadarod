package ermolich_homework.task_9;

public class Animal {

    private String color;
    private int maxYear;
    private String food;

    public Animal(String color, int maxYear, String food) {
        this.color = color;
        this.maxYear = maxYear;
        this.food = food;
    }

    public void Sound() {
        System.out.println("издание звуков");
    }

    public void Play() {
        System.out.println("животное играет");
    }

    public String info() {
        String info = " цвет: " + color + " макс. возраст: " + maxYear + " еда: " + food;
        return info;
    }

    public String getColor() {
        return color;
    }

    public int getMaxYear() {
        return maxYear;
    }

    public String getFood() {
        return food;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) obj;
        if (color.equals(animal.getColor()) && maxYear == animal.getMaxYear() && food.equals(animal.getFood())) {
            return true;
        }
        return false;
    }
}


