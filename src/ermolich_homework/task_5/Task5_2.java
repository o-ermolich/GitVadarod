package ermolich_homework.task_5;
import java.util.Scanner;

public class Task5_2 {
        public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            System.out.println("Введите a");
            int a=in.nextInt();
            System.out.println("Введите b");
            int b=in.nextInt();

            int sum = 0;

            if (a>0 & b>0) {
                a++;
                while (a<b) {
                    sum+=a;
                    a++;
                }
            System.out.println("сумма чисел " + sum);
        }
           else System.out.println("числа должны быть положительными");

        }
    }

