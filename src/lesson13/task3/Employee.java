package lesson13.task3;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String fullname;
    private double salary;
   private LocalDate salaryDate = LocalDate.of(2019, 02, 13);

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullname, employee.fullname) &&
                Objects.equals(salaryDate, employee.salaryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname, salary, salaryDate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}
