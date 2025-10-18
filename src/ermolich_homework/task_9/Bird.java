package ermolich_homework.task_9;

public class Bird extends Animal{
    private String family;
    private int maxHeight;

    public Bird(int maxHeight, String family, String color, int maxYear, String food) {
        super(color,maxYear,food);
        this.family = family;
        this.maxHeight = maxHeight;
    }

    public void Sound() {
        System.out.println(family + " поёт");
    }

    public void Play() {
        System.out.println(family + " клюёт");
    }

    public void Incubate() {
        System.out.println(family + " высиживает");
    }

    public String info() {
        String info = " семейство: " + family + " высота полёта: " + maxHeight + super.info();
        return info;

    }

    public String getFamily() {
        return family;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (family.equals(bird.getFamily()) && maxHeight == bird.getMaxHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (family.hashCode() + maxHeight);
        return result;
    }
}