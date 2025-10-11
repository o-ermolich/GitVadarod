package ermolich_homework.task_8;

public class CreateString {
    public static void main(String[] args) {
        String result1 = manipulateStrings("Я люблю java", "java");
        System.out.println(result1);

        String result2 = manipulateStrings("Я люблю Java", "python");
        System.out.println(result2);
    }

    public static String manipulateStrings(String str1, String str2) {
        boolean endString = str1.endsWith(str2);
        int index = str1.indexOf(str2);
        if (endString) {
            return str1.substring(0, index);
        } else {
            return str1.substring(0, 7).toUpperCase();
        }
    }
}