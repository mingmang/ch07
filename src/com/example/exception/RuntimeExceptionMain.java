package com.example.exception;

public class RuntimeExceptionMain {
    public static void main(String[] args) {
        try{
            makeExceptions();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void makeExceptions() {
        makeException1(10);
        makeException2();
        makeException3();
        makeException4();
        makeException5();
        makeException6();
        makeException7();
        makeException8();
    }
    public static int makeException1(int input) {   //ArithmeticException
        int div = input/0;
        return div;
    }
    public static void makeException2() {           //OutOfBoundArrayException
        String a = "a";
        System.out.println(a.charAt(1));
    }
    public static void makeException3() {           //
        int[] a = {1,2,3,4,5};
        System.out.println(a[5]);
    }
    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split(" "));
    }
    public static void makeException5() {
        String a = "a";
    }
    public static void makeException6() {
        makeException6();
    }
    public static void makeException7() {
        Object[] objArr = new String[2];
        objArr[0] = 0;
    }
    public static void makeException8() {
        Object[] objArr = new String[2];
        objArr[0]="abc";
    }

}
