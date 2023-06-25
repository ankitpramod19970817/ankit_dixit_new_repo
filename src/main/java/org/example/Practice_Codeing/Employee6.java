package org.example.Practice_Codeing;
/*take employee and timesheet object as entry and findmonthly salary*/

import java.util.function.BiFunction;

public class Employee6 {
    String empname;
    double dailywages;

    public Employee6(String empname, double dailywages) {
        this.empname = empname;
        this.dailywages = dailywages;
    }

}
class Salary {
    int noofdays;

    public Salary(int noofdays) {
        this.noofdays = noofdays;
    }
    public static void main(String[] args) {
        Employee6 e = new Employee6("Ankit", 15000);
        Salary s = new Salary(30);
        BiFunction<Employee6, Salary, Double> b = (dailywages, noofdays) -> s.noofdays * e.dailywages;
        System.out.println(b.apply(e,s));

    }
}
