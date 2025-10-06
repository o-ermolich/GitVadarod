package ermolich_homework.task_7;

public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int score;

//    public Student()
//    {
//        System.out.println();
//    }

    public Student(int id, String name, String surname, String faculty, int course, String group, int score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.score = score;
    }

    public void info() {
        System.out.println("id: " + id + " имя: " + name + " фамилия: " + surname + " факультет: " + faculty + " курс: " + course + " группа: " + group + " средняя оценка: " + score);
    }

    public void change_group(String group1) {
        group = group1;
    }

    public void new_group() {
        System.out.println("Новая группа: " + group);
    }

    public void change_score_group(int score2, String group2) {
        score = score2;
        group = group2;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name + " " + surname;
    }

    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student value : students) {
            if (value.getScore() > mark) {
                count++;
            }
        }

        Student[] newStudent = new Student[count];
        int index = 0;

        // Заполняем новый массив
        for (Student student : students) {
            if (student.getScore() > mark) {
                newStudent[index] = student;
                index++;
            }
        }

        return newStudent;
    }

}

