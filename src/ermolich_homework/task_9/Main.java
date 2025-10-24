package ermolich_homework.task_9;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("белый", 18, "мясо", "Ричард", "доберман", 20.7);
        Bird bird = new Bird(100, "Цапля", "серый", 7, "насекомые");
        Animal animal1 = new Animal("серый", 20, "мясо");

        dog.Sound();
        dog.Bite();
        dog.Jump();
        bird.Incubate();
        bird.Play();

        System.out.println("********************************");
        System.out.println(bird.info());
        System.out.println(dog.info());

        System.out.println("********************************");

        Zoo zoo = new Zoo();
        Dog dog1 = new Dog("серый", 3, "корм", "Оливия", "болонка", 3.7);
        Dog dog2 = new Dog("чёрно-белый", 10, "рыба", "Лайма", "ротвейлер", 40);
        Dog dog3 = new Dog("черепаховый", 14, "всё", "Толик", "пудель", 5.5);
        Dog dog4 = new Dog("чёрно-белый", 7, "рыба", "Лайма", "ротвейлер", 40);
        Bird bird1 = new Bird(70, "удод", "пёстрый", 7, "зерно");
        Bird bird2 = new Bird(130, "дрозд", "чёрный", 8, "насекомые");
        Bird bird3 = new Bird(70, "соловей", "серый", 6, "кукуруза");
        Bird bird4 = new Bird(70, "соловей", "серый", 6, "кукуруза");

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);
        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);
        zoo.getAnimals();

        Animal[] allAnimals = zoo.getAnimals();

        for (Animal animal : allAnimals) {
            if (animal != null){
                animal.Sound();
                animal.Play();
                //  System.out.println();
            }
            System.out.println();}

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog4));
        System.out.println(bird4.equals(bird3));
        System.out.println(bird3.equals(bird2));

        System.out.println(dog2.hashCode());
        System.out.println(dog4.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println(bird3.hashCode());
        System.out.println(bird4.hashCode());
        System.out.println(bird1.hashCode());
    }
}
