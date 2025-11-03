package ermolich_homework.task_14;
import java.util.ArrayList;
import java.util.List;

public class Ward {
    private int number;
    private List<Patient> patients;
    private typeWard type;

    public enum typeWard {
        мужская,
        женская
    }

    public Ward(int number, typeWard type) {
        this.number = number;
        this.type = type;
        this.patients = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Пациент " + patient.getName() + " " + patient.getLastName() + " уже находится в палате.");
            return false;
        }

        if (patients.size() <= 3) {
            patients.add(patient);
            return true;
        } else {
            System.out.println("В палате нет свободных мест.");
            return false;
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Ward{" +
                "number=" + number +
                ", patients=" + patients +
                ", type=" + type +
                '}';
    }

    public boolean addPatientByDiagnosis(Patient patient) {
                for (Patient p : patients) {
            if (!p.getDiagnosis().equals(patient.getDiagnosis())) {
                return false;
            }
        }
        if (patients.size() < 3) {
            patients.add(patient);
            return true;
        } else {
            return false;
        }
    }

    public void printPatients() {
        System.out.println("Палата " + number + " (" + type + "):");
        for (Patient patient : patients) {
            System.out.println(patient.getName() + " " + patient.getLastName() + ", Возраст: " + patient.getAge() + ", Диагноз: " + patient.getDiagnosis());
        }
    }

}
