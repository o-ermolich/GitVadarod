package ermolich_homework.task_6;

import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        //Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each

        int[] array = new int[10];
        int i;

        for (i=0; i<=9; i++) {
            Scanner in=new Scanner(System.in);
            System.out.println("Введите " + (i+1) + " элемент массива");
           array[i]=in.nextInt();
        }

        System.out.println("Массив: ");

        for (int value : array) {
            System.out.print(value+" ");
        }

        for (i=0; i<=9; i++) {
            if (i%2==0) {
                array[i]=0;}
            }
        System.out.println();
        System.out.println("Новый массив: ");

        for (int value : array) {
            System.out.print(value+" ");
        }
    }
}

