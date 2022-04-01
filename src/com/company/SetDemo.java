package com.company;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Person> s = new TreeSet<Person>();
        s.add(new Person(23, "jot"));
        s.add(new Person(34, "zasnual"));
        s.add(new Person(36,"mot"));
        System.out.println(s);
    }
    static class Person implements Comparable <Person>{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name= name;
        }

        @Override
        public int compareTo(Person o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    "Name="+ name +'}';
        }
    }

}
