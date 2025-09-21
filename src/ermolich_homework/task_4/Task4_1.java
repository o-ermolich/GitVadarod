package ermolich_homework.task_4;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Введите a");
        int a=in.nextInt();
        System.out.println("Введите b");
        int b=in.nextInt();
        System.out.println("Введите c" );
        int c=in.nextInt();

        System.out.println("Чётные числа: " );
        if (a % 2 == 0)
            System.out.println (a);

        if (b % 2 == 0)
            System.out.println (b);

        if (c % 2 == 0)
            System.out.println (c);
    }
    }
