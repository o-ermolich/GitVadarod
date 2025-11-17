package ermolich_homework.task_15;

public class Employer {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Employer(int id,  String name, String lastName, int age, double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        Employer employer = (Employer) o;
        return  (id == employer.id && name.equals(employer.getName()) && lastName.equals(employer.getLastName()) && age == employer.age && salary == employer.getSalary());
    }

    public int hashCode() {
        int result = (int) (id + name.hashCode() + lastName.hashCode() + age + salary);
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
