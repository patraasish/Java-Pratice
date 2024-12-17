package com.pratice.java17;


 record Employee(int id,String name){
	
	 static int age;
	 
	 Employee(int id){
		 this(id,"default");
	 }
}

public class RecordClassDemo {

	public static void main(String args[]) {
		Employee emp1=new Employee(1,"Asish Patra");
		Employee emp2=new Employee(3);
		
		System.out.println(emp1.toString());
		System.out.println(emp2);
		System.out.println(emp1.id());
		System.out.println(emp1.name());
		Employee.age=32;
		System.out.println(Employee.age);
	}
}
