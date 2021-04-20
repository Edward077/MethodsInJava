package com.Edward;

public class MethodWithIfStatment {
    static void method(int Age){

        // Application of the if statement
        if (Age<18){
            System.out.println("under age");
        }else if (Age>18){
            System.out.println("correct and congratulation");

        }
    }

    public static void main(String[] args) {
        method(12);
        method(34);


    }
}
