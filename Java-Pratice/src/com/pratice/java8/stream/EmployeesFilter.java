package com.pratice.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesFilter {

    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<Employee>();
        Employee e1=new Employee("Shivam", 20000);
        Employee e2=new Employee("Asish",200000);
        Employee e3=new Employee("Shukla",3000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);
        List<Employee> sortedEmployeeBySalary=employeeList.stream()
                .sorted((x,y)-> (int) (y.getSalary()-x.getSalary()))
                .collect(Collectors.toList());

        List<Employee> sortedEmployeeByName=employeeList.stream()
                .sorted((x,y)-> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

        List<Employee> sortedEmployeeByNameDesc=employeeList.stream()
                .sorted((x,y)-> y.getName().compareTo(x.getName()))
                .collect(Collectors.toList());


        System.out.println("Sorted by Salary: "+sortedEmployeeBySalary);
        System.out.println("Sorted by Name: "+sortedEmployeeByName);
        System.out.println("Sorted by Name desc: "+sortedEmployeeByNameDesc);
    }

}
