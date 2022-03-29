package com.company;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(30);
        list1.add("manu");
        list1.add(12);
        list1.add("alish");
        list1.add(3.55);
        list1.add("yuyu");
        list1.add(0.0004);
        list1.add("ytytrfd");

/*         =====================Using Enhanced For Loop for iterating each object/element in the arraylist=============== */
        for(Object o: list1){
            System.out.println(o);
        }
      /*  ========================Using iterator for each element in the arraylist=============================*/
        Iterator itr = list1.iterator();
        while(itr.hasNext()){
            Object o = itr.next();
            /*===========Removing unwanted object from an element=============*/
            if(o == "manu"){
                itr.remove();
            }

        }
        System.out.println(list1);
        }



}
