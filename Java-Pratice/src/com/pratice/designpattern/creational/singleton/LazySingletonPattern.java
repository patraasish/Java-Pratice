package com.pratice.designpattern.creational.singleton;

public class LazySingletonPattern {

    /*
    In LazySingletonPattern there is one problem , what if multiple threads call same time to getInstance Method
    They are checking at same time and instance is null then they are create multiple times
    Its break our singleton principles
    * */
   private static LazySingletonPattern lazySingletonPattern=null;

   private String text="LazySingletonPattern";

   private LazySingletonPattern(){

   }

   public String getText(){
       return text;
   }
   public static LazySingletonPattern getInstance(){
       if(lazySingletonPattern==null){
           lazySingletonPattern =new LazySingletonPattern();
       }
       return lazySingletonPattern;
   }
}
