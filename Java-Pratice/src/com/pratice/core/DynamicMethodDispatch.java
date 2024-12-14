package com.pratice.core;

import java.util.Scanner;


//In Java, we can override methods only, not the variables(data members),
// so runtime polymorphism cannot be achieved by data members.
interface Demo1{
    void method();
    int a=9;
}

class Test implements Demo1{


    @Override
    public void method(){
        System.out.println("I am implements from Test1 class");
    }

}

class Test2 implements Demo1{

    @Override
    public void method() {
        System.out.println("I am implements from Test2 class");
    }

}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo1 demo=null;

        System.out.println("Which Class want to create object: ");
        String className=sc.nextLine();
        System.out.println("sdf");

        if(className.equals("Test1")){
            demo=new Test();
            System.out.println("Test1 object Created..."+ Demo1.a);
            demo.method();

        }
        else if (className.equals("Test2")){
            demo=new Test2();
            System.out.println("Test2 object Created..."+Demo1.a);
            demo.method();
        }

    }

}
