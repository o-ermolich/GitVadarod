package ermolich_homework.task_5;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {

        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();

        if (a % 10 == 0) System.out.println("Число не должно заканчиваться на 0");
        else {
            while (a > 0) {
                i = a % 10;
                a/=10;
                System.out.print(i);
            }
        }
    }
}
