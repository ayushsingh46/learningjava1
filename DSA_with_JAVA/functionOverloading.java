package com.ayyuusshh;

public class functionOverloading {
    public static void main(String[] args) {
        fun(23);
        fun("Ayush");
    }
//two ways to provide function overloading is either the number of args should be diff or the types of args should be diff
    static void fun(int roll_num){
        System.out.println("RollNo is " +roll_num);
    }
    static void fun(String name){
        System.out.println("Name is "+ name);
    }
}
