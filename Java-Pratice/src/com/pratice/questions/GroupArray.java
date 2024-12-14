package com.pratice.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupArray {

    /*
    * arr[]={1,3,2,0,0,21,1,1}
    * in array keep all 0 in left side of array
    * and
    * keep all 1 in right side of array
    * */


    public static void main(String[] args) {

//        int arr[]={1,3,2,0,0,21,1,1};
//        int arrSize=arr.length;
//
//        for (int i = 0; i < arrSize; i++) {
//
//            if(arr[i]==0){
//
//            }
//        }

        final String regex = "([0-9]{1,})([a-zA-Z]{1,}[a-zA-Z0-9]{0,})";
        final String string = "123ahaha1234";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
