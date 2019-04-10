package lesson12.task7;

public class Report  {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Fedorov", 2000.43434);
        Employee employee2 = new Employee("Smirnov", 2500.45345);
        Employee employee3 = new Employee("Sidorov", 30600.45745);
        Employee[] employees = {employee1, employee2, employee3};
        generalReport(employees);
    }
    private static void generalReport(Employee[] employees){
        for (Employee employee :employees ) {
            System.out.printf("Salary of %s is %10.2f%n",employee.getFullname(),employee.getSalary());
        }
    }
}

