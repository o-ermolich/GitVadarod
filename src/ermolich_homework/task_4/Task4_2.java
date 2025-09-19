package ermolich_homework.task_4;

import java.util.Scanner;

public class Task4_2 {
    //На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();

        System.out.println("Числа, которые дедятся на 2 и на 5: ");
        if (a % 2 == 0 & a % 5 == 0)
            System.out.println(a);
        if (b % 2 == 0 & b % 5 == 0)
            System.out.println(b);
        if (c % 2 == 0 & c % 5 == 0)
            System.out.println(c);
    }
}