package lesson13.task3;

import java.io.UnsupportedEncodingException;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void main(String[] args)throws UnsupportedEncodingException {
        Employee employee1 = new Employee("Fedorov", 2000.43434);
        Employee employee2 = new Employee("Smirnov", 2500.45345);
        Employee employee3 = new Employee("Sidorov", 30600.45745);
        Employee[] employees = {employee1, employee2, employee3};
        Locale locale = new Locale("ru", "RU");
        Locale locale1 = new Locale("", "");
        generalReport(employees,locale);
        generalReport(employees,locale1);
    }
    private static void generalReport(Employee[] employees,Locale locale)
            throws UnsupportedEncodingException {
        ResourceBundle rb=ResourceBundle.getBundle("name",locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
           value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMMM, yyyy", locale);
        System.out.println(employees[0].getSalaryDate().format(formatter));
        for (Employee employee :employees ) {
            System.out.printf("Salary of %s is %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}

