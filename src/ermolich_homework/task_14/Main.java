package ermolich_homework.task_14;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Семён", "Пароваров", 23, "Высокофункциональная депрессия", Patient.sex.мужской);
        Patient patient2 = new Patient(2, "Карина", "Денисова", 33, "Острое отравление", Patient.sex.женский);
        Patient patient3 = new Patient(1, "Семён", "Пароваров", 23, "Высокофункциональная депрессия", Patient.sex.мужской);
        Patient patient4 = new Patient(4, "Михаил", "Перко", 42, "Деменция", Patient.sex.мужской);
        Patient patient5 = new Patient(5, "Диана", "Филиппович", 18, "Неуточненный делирий", Patient.sex.женский);
        Patient patient6 = new Patient(6, "Ольга", "Билык", 19, "Органический галлюциноз", Patient.sex.женский);
        Patient patient7 = new Patient(7, "Кристина", "Савостеева", 25, "Кишечная непроходимость", Patient.sex.женский);
        Patient patient8 = new Patient(8, "Анастасия", "Черненко", 27, "Перитонит", Patient.sex.женский);
        Patient patient9 = new Patient(9, "Валентина", "Сорока", 35, "Маниакальное расстройство", Patient.sex.женский);

        Ward ward1 = new Ward(301, Ward.typeWard.женская);
        ward1.addPatient(patient2);
        ward1.addPatient(patient5);
        ward1.addPatient(patient6);

        Ward ward2 = new Ward(302, Ward.typeWard.мужская);
        ward2.addPatient(patient1);
        ward2.addPatient(patient3);
        ward2.addPatient(patient4);

        Ward ward3 = new Ward(303, Ward.typeWard.женская);
        ward3.addPatient(patient7);
        ward3.addPatient(patient8);
        ward3.addPatient(patient9);

        Department department1 = new Department("Психиатрическое");
        department1.addWard(ward1);
        department1.addWard(ward3);

        Department department2 = new Department("Инфекционное");
        department2.addWard(ward2);

        int[] counts1 = department1.countMenAndWomen();
        System.out.println("Общее количество мужчин: " + counts1[0]);
        System.out.println("Общее количество женщин: " + counts1[1]);

       int[] counts2 = department2.countMenAndWomen();
        System.out.println("Общее количество мужчин: " + counts2[0]);
        System.out.println("Общее количество женщин: " + counts2[1]);

        ward1.printPatients();
        ward2.printPatients();
        ward3.printPatients();
    }
}
