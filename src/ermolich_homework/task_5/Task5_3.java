package ermolich_homework.task_5;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Введите a");
        int a=in.nextInt();
        System.out.println("Введите b");
        int b=in.nextInt();

        int sum = 0;
        int min,max;

        if (a<b) {
            min = a;
            max = b;
        } else {
            max = a;
            min = b;
        }

        if (min>0 & max>0) {
            min++;
            while (min<max) {

                sum+=min;
                min++;
            }
        }
        else System.out.println("числа должны быть положительными");

        System.out.println("сумма чисел " + sum);
    }
}
