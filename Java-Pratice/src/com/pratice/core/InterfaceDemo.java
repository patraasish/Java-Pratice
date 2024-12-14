package com.pratice.core;

interface Demo{

    int num=9;

    //directly we cant call private method from interface
    //but we can call through default method
    private void privateMethod(){
        System.out.println("Private method "+num);
    }

    default void defaultMethod(){
        privateMethod();
    }
}

interface Demo2{
    void method2();
}
public class InterfaceDemo implements Demo,Demo2{

    public static void main(String[] args) {
      //  InterfaceDemo interfaceDemo=new InterfaceDemo();
      // interfaceDemo.defaultMethod();
        System.out.println( Demo.num);
    Demo demo=new InterfaceDemo();
    Demo2 demo2=new InterfaceDemo();

    }

    @Override
    public void method2() {
        System.out.println("Demo2");
    }
}
