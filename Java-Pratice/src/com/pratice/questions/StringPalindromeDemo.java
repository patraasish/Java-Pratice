package com.pratice.questions;

import java.util.Scanner;

public class StringPalindromeDemo {

    static String isPalindrome(String text){
        String revString="";
        char[] temp=text.toCharArray();

        for (int i = text.length()-1; i >=0 ; i--) {
            revString=revString+temp[i];
        }

        if(text.equals(revString)){
            return "It's Palindome";
        }
        return "Not Palindrome";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Text: ");
        String text=scanner.nextLine();
        String result=isPalindrome(text);
        System.out.println(result);
    }
}
