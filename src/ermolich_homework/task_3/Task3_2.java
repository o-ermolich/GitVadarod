package ermolich_homework.task_3;

public class Task3_2 {
    public static void main(String[] args) {
        //x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился.
        // x=8; y=9; z=12; (операции присваивания, нужно просто написать по-другому)

        int x=8;
        int y=9;
        int z=12;

        x+=5;
        y*=9;
        z-=6;

        System.out.println(x + " " + y + " " + z);
    }
}
