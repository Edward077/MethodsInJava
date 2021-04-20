package com.Edward;

public class MethodOverLoading {
    static int plusMethod( int x, int y){
        int sum = x+y;
        System.out.println("the sum of x and y ="  + sum);
         sum =0;
        switch (sum){
            case 8:
                System.out.println("congratulation");
                break;
        }
        return x +y;
    }
    static double plusMethod(double x, double y){
        System.out.println("the sum of x and y ="   + x +  ""  + y);

        return  x + y;


    }

    public static void main(String[] args) {
        plusMethod(3,5);
        plusMethod(2.0,4.0);

    }
}
