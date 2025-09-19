package ermolich_homework.task_4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        // 15/x = result
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();

        double res = 15.0 / x;
        int res1 = (int) res;
        if (res == res1) {
            switch (res1) {
                case 3:
                    System.out.println("Результат деления равен 3");
                    break;

                case 5:
                    System.out.println("Результат деления равен 5");
                    break;

            }
        } else {
            System.out.println("Результат деления равен дробному числу " + res);
        }
    }
}
