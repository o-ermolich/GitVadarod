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


    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(students);
            students.clear();
        }
    }

    public double calculateAverageMark() {
        if (students.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Student student : students) {
            total += student.getAvgMark();
        }

        return total / students.size();
    }
}
