package com.pratice.core.serialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {

        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("Asish");
        employee.setAge(32);
        employee.setSalary(23456);

        try{
            FileOutputStream file=new FileOutputStream("src//employee.txt");
            ObjectOutputStream object=new ObjectOutputStream(file);
            object.writeObject(employee);
            System.out.println("Serialization Successful..");
        }

        catch (Exception e){
            e.printStackTrace();
        }

    }

}
