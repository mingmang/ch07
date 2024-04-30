package com.example.modifier;

class Singleton{
    private static Singleton one;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(one==null){
            one=new Singleton();
        }
        return one;
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
