package com.Edward;

public class MethodWithValues {
    static int myMethod(int age){
//        System.out.println("The age Return is = " + age);
        return 5 + age;
    }

    public static void main(String[] args) {
//        MethodWithValues mm = new MethodWithValues();
//        mm.myMethod(23);
//        myMethod(23);
//        myMethod(45);
        int x= myMethod(6);
        System.out.println("the age is=" +x);
    }
}
