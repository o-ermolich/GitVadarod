package ermolich_homework.task_19.UpperCase;

public class Main {
    public static void main(String[] args) {

        Multi multi = (text) -> text.toUpperCase();

        UppesCase(multi, "hello teacher");
    }

    private static void UppesCase(Multi multi, String text) {
       String result = multi.multiplication(text);
        System.out.println(result);
    }
}



