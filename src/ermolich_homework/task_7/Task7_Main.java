package ermolich_homework.task_7;

public class Task7_Main {
    public static void main(String[] args) {
        Student stud = new Student(3, "Anton", "Bykov", "Физический", 3, "302", 5);
        stud.info();
        stud.change_group("402");
        stud.new_group();
        stud.change_score_group(6, "406");

        System.out.println("********************");

        Student[] students = new Student[5];
        students[0] = new Student(4, "Иван", "Смирнов", "экономический", 2, "400", 4);
        students[1] = new Student(5, "Анна", "Котова", "филологический", 1, "103", 6);
        students[2] = new Student(6, "Марина", "Десятова", "математический", 1, "102-3", 7);
        students[3] = new Student(7, "Пётр", "Мойша", "экономический", 2, "400", 3);
        students[4] = new Student(8, "Семён", "Косячкин", "физический", 5, "50-Т", 8);

        Student[] result = Student.getStudents(students, 6);

        for (Student student : result) {
            System.out.println(student.getName() + " - " + student.getScore());
        }

    }
}
