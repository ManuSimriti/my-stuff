package com.company;

import java.util.*;

public class Collect {
    public static void main(String[] args) {
        Queue<Integer> list = new PriorityQueue<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(list.peek());
        list.poll();
        System.out.println(list);
        System.out.println(list.peek());
        list.poll();
        System.out.println(list);
        System.out.println(list.peek());
        list.poll();
        System.out.println(list);

    }
}