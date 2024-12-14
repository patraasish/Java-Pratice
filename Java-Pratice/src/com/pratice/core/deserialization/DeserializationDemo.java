package com.pratice.core.deserialization;



import com.pratice.core.serialization.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream file=new FileInputStream("src//employee.txt");
        ObjectInputStream in=new ObjectInputStream(file);

        Object object=new Employee();
        object=in.readObject();

        Employee employee=(Employee) object;

        System.out.println("Employee ID: "+employee.getId());
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Employee Age: "+employee.getAge());
        System.out.println("Employee Salary: "+employee.getSalary());

    }
}
