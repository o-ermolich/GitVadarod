package ermolich_homework.task_14;

public class Patient {
    private int id;
    private String name;
    private String lastName;
    private String diagnosis;
    private int age;
    private sex gender;

    public enum sex {
        мужской,
        женский
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public sex getGender() {
        return gender;
    }

    public void setGender(sex gender) {
        this.gender = gender;
    }

    public Patient(int id, String name, String lastName, int age, String diagnosis, sex gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.diagnosis = diagnosis;
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        Patient patient = (Patient) o;
       return  (id == patient.id && name.equals(patient.getName()) && lastName.equals(patient.getLastName()) && diagnosis.equals(patient.getDiagnosis()) && age == patient.age && gender == patient.gender);

    }

    public int hashCode() {
        int result = (id + name.hashCode() + lastName.hashCode() + diagnosis.hashCode() + age + gender.hashCode());
        return result;
    }
}
