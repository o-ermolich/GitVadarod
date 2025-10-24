package ermolich_homework.task_9;

public class Zoo {
    private Animal[] animals = new Animal[5];

    public void addAnimal(Animal animal) {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            count++;
        }
        Animal[] newAnimals = new Animal[count + 1];
        for (int i = 0; i < count; i++) {
            newAnimals[i] = animals[i];
        }

        newAnimals[count] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void info() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.info());
            }
        }
    }
}
