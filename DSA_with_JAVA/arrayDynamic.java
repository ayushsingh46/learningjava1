package com.ayyuusshh;

import java.util.ArrayList;

public class arrayDynamic {
    public static void main(String[] args) {
      //syntax

        ArrayList<Integer> list = new ArrayList<>(7);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);


        System.out.println(list.contains(100));
        System.out.println(list);
        list.set(4 , 45);
        list.remove(4);
        System.out.println(list);
    }
}
