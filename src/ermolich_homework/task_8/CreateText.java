package ermolich_homework.task_8;

public class CreateText {
    public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) или метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 7;
        String strToInsert = "привет";

        String newText = insertAfterK(k, strToInsert, text);
        System.out.println(newText);
    }

    public static String insertAfterK(int k, String strToInsert, String text) {
        String newTextResult = "";
        String[] words = text.split(" ");

        for (String word : words) {
            if (word.length() > k) {
                String modifiedWord = word.substring(0, k + 1) + strToInsert + word.substring(k + 1);
                newTextResult += modifiedWord;
            } else {
                newTextResult += word;
            }
            newTextResult += " ";
        }

        return newTextResult;
    }
}