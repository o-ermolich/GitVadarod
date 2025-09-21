package ermolich_homework.task_5;

public class Task5_1 {
    public static void main(String[] args) {
        int i;

        for (i=1; i<=100; i++) {
            if (i%7==0 | i%3==0) {
                System.out.printf(i + " ");
            }
        }
    }
}
