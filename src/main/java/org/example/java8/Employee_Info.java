package org.example.java8;

public class Employee_Info {
    String name;
    String designation;
    String city;

    public Employee_Info(String name, String designation, String city) {
        this.name = name;
        this.designation = designation;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee_Info{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
