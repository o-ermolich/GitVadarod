package ermolich_homework.task_20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;

public class StringGenerator implements Callable<String> {
    private int fileId;
    private Random random = new Random();

    public StringGenerator(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public String call() throws Exception {
        String fileName = "file_" + fileId + ".txt";
        System.out.println(Thread.currentThread().getName() + " starts creating " + fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                String randomString = generateRandomString();
                writer.write(randomString);
                writer.newLine();
            }

            int sleepTime = random.nextInt(3) + 1; // 1, 2 или 3 секунды
            Thread.sleep(sleepTime * 1000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " finished creating " + fileName);
        return fileName;
    }

    private String generateRandomString() {
        int length = random.nextInt(10) + 5;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }
}
