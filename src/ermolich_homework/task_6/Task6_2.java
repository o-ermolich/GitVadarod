package ermolich_homework.task_6;

public class Task6_2 {
    public static void main(String[] args) {

    int[] array = {32,6,4,13,65};
    int []array1 = new int[array.length+1];
   int i;

        for (i=0; i<array.length; i++)
                array1[i]=array[i];


        array1[array1.length - 1] = 0;

        for (int value : array1) {
            System.out.print(value+" ");
        }
    }
}
