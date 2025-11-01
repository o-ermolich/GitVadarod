package ermolich_homework.task_13;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иван", "Иванов", "01.01.2000", "Москва", 3.5);
        Student student2 = new Student("Петр", "Петров", "02.02.2001", "Санкт-Петербург", 2.9);
        Student student3 = new Student("Светлана", "Сидорова", "03.03.1999", "Новосибирск", 4.8);

        Group group1 = new Group("М-101");
        group1.addStudent(student1);
        group1.addStudent(student2);

        Group group2 = new Group("М-102");
        group2.addStudent(student3);

        Faculty faculty = new Faculty("Математический факультет");
        faculty.addGroup(group1);
        faculty.addGroup(group2);

        faculty.printFacultyInfo();

        group1.removeStudentsByMark(3.0);
        System.out.println("Студенты в группе после удаления:");
        group1.printStudents();

        group2.transferToGroup(group1);
        System.out.println("Студенты в новой группе после трансфера:");
        group1.printStudents();
        group2.printStudents();

        double avgMark = group1.calculateAverageMark();
        System.out.println("Средний балл по группе: " + avgMark);
    }
}
