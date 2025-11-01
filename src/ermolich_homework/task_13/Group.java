package ermolich_homework.task_13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() { return students; }
    public void addStudent(Student student) { this.students.add(student); }

       public void removeStudentsByMark(double mark) {
        List<Student> studentsToRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAvgMark() < mark) {
                studentsToRemove.add(student);
            }
        }

        students.removeAll(studentsToRemove);
    }
    public void printStudents() {
        if (students.isEmpty()) {
            System.out.println("  В группе " + groupNumber + " нет студентов.");
        } else {
            for (Student student : students) {
                System.out.println("    Студент: " + student.getFirstName() + " " + student.getLastName() +
                        ", Средний балл: " + student.getAvgMark());
            }
        }
    }


    // Метод для перевода студентов в другую группу
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(students);
            students.clear();
        }
    }

    // Метод для подсчета среднего балла по группе
    public double calculateAverageMark() {
        if (students.isEmpty()) {
            return 0.0; // Если группа пуста, возвращаем 0
        }

        double total = 0.0; // Сумма всех баллов
        for (Student student : students) {
            total += student.getAvgMark(); // Добавляем балл каждого студента
        }

        return total / students.size(); // Возвращаем среднее значение
    }
}
