package ermolich_homework.task_14;
import java.util.HashSet;
import java.util.Set;
public class Department {
    private String nameDepartment;
    Set<Ward> wards = new HashSet<>();

    public Department(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
    public void addWard (Ward ward){
        this.wards.add(ward);
    }

    public int[] countMenAndWomen() {
        int menCount = 0;
        int womenCount = 0;

        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Patient.sex.мужской) {
                    menCount++;
                    System.out.println("Мужчина: " + patient.getName() + " " + patient.getLastName());
                } else {
                    womenCount++;
                    System.out.println("Женщина: " + patient.getName() + " " + patient.getLastName());
                }
            }
        }

        return new int[]{menCount, womenCount};
    }
}
