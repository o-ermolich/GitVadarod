package ermolich_homework.task_3;

public class Task3_4 {
    public static void main(String[] args) {
        //Даны значения: x=5; y=2; c=x*y;
        //Cоставьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с = 12, x = 6, y = 1

        int x = 5;
        int y = 2;
        int c;

        c = ++x * y--;

        System.out.println("x = " + x + " y = " + y + " результат с = "+ c);
    }
}
