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

    public void Sound(){
        System.out.println("издание звуков");
    }

    public void Play() {
        System.out.println("животное играет");
    }

    public String info() {
        String info = " цвет: " + color + " макс. возраст: " + maxYear + " еда: " + food;
        return info;
    }
}
