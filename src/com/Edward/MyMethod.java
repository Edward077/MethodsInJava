package com.Edward;

public class MyMethod {

    void methodTry( String name, int age){
        System.out.println(" more understanding in methods " + "" + name +  " age " + "" + age);
    }

    public static void main(String[] args) {
        MyMethod m = new MyMethod();
        m.methodTry("Edward", 34);
        m.methodTry("Matha", 23);
        m.methodTry("Ansu",24);
        m.methodTry("Lucky",4);
    }

}
