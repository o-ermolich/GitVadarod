package ermolich_homework.task_13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Group> groups;

    public Faculty(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public void printFacultyInfo() {
        System.out.println("Факультет: " + name);
        for (Group group : groups) {
            System.out.println("  Группа: " + group.getGroupNumber());
            for (Student student : group.getStudents()) {
                System.out.println("    Студент: " + student.getFirstName() + " " + student.getLastName() +
                        ", Средний балл: " + student.getAvgMark());
            }
        }
    }
}
