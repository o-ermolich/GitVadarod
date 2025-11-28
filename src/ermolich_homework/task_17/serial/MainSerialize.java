package ermolich_homework.task_17.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerialize {
    public static void main(String[] args) {
        Auto auto1 = createAuto();
        serialize(auto1, "src/auto1.txt");
        Auto auto2 = deserialize("src/auto1.txt");
        System.out.println(auto2);
    }

    static Auto createAuto() {
        Auto auto1 = new Auto("Audi", 315, "Germany");
        return auto1;
    }

    private static void serialize(Auto auto, String file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(auto);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }

    private static Auto deserialize(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Auto autoResult = (Auto) objectInputStream.readObject();
            return autoResult;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка");
        }
    }
}