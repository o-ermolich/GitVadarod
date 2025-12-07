package ermolich_homework.task_21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println(date1());
        System.out.println(date2());
        System.out.println(date3("2023-03-19 : 10:12:24 AM"));
        System.out.println(date4("пн 20.03.23 г. время: 15:07:28"));
    }

    public static String date1() {
        LocalDate localDate1 = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return localDate1.format(dateTimeFormatter);
    }

        public static String date2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss a");
        return localDateTime.format(dateTimeFormatter);
    }

    public static LocalDateTime date3(String dateStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        return LocalDateTime.parse(dateStr, dateTimeFormatter);
    }

    public static LocalDateTime date4(String dateStr) {
                DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .appendPattern("E dd.MM.yy 'г.' время: HH:mm:ss")
                .toFormatter();

        return LocalDateTime.parse(dateStr, dateTimeFormatter);
    }
}
