package com.pratice.questions;

import java.util.Scanner;

public class StringReverseDemo {

    static String reverseString(String text){
        String revString="";
        char[] tempText;
        tempText=text.toCharArray();

        for (int i=text.length()-1;i>=0;i--){
            revString=revString+tempText[i];
        }

        return revString;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter text: ");
//        String text=sc.nextLine();
//        String result=reverseString(text);
//        System.out.println(result);

        String name="Ashdjh Sjhf";
        name.toLowerCase();
        System.out.println(name);
        name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();
    }
}
