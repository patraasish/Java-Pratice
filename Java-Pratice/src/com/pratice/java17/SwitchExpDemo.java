package com.pratice.java17;

public class SwitchExpDemo {

    public static void main(String[] args) {

        String day="mon";

      String  result= switch (day){
            case "sun"-> "7 am";
            default -> "6 am";
        };

        System.out.println(result);
    }
}
