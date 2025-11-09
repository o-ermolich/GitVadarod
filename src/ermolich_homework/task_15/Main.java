package ermolich_homework.task_15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Employer, String> employee = new HashMap<>();

        Employer employer1 = new Employer(1, "      ", "        ", 27, 1000.40);
        Employer employer2 = new Employer(2, "      ", "        ", 32, 925.66);
        Employer employer3 = new Employer(3, "       ", "        ", 32, 1200.00);
        Employer employer4 = new Employer(4, "         ", "      ", 25, 1000.40);
        Employer employer5 = new Employer(5, "     ", "        ", 40, 930.80);
        Employer employer6 = new Employer(6, "     ", "        ", 25, 1115.00);
        Employer employer7 = new Employer(7, "      ", "       ", 36, 990.20);
        Employer employer8 = new Employer(8, "      ", "       ", 28, 1300.00);

        employee.put(employer1, "developer");
        employee.put(employer2, "qa");
        employee.put(employer3, "project_manager");
        employee.put(employer4, "product_owner");
        employee.put(employer5, "qa");
        employee.put(employer6, "designer");
        employee.put(employer7, "developer");
        employee.put(employer8, "developer");

        raiseSalaryForProfession(employee, 200, "project_manager");

    }

    private static void raiseSalaryForProfession(Map<Employer, String> employees, int amountOfIncrease, String profession) {
        for (Map.Entry<Employer, String> entry : employees.entrySet()) {
            if (entry.getValue().equals(profession)) {
                Employer emp = entry.getKey();
                double oldSalary = emp.getSalary();
                emp.setSalary(oldSalary + amountOfIncrease);
                System.out.println("         : " + emp + "          : " + oldSalary + "         : " + emp.getSalary());

            }
        }
    }
}
