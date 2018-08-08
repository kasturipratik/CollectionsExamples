package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

    public void showIterator(){

        // Using iterator
        /*
         * Similar to loop
         *
         * Iterators can be used in list and set but
         * ListIterator can only be used in list
         *
         * ListIterator iterates in both forward and  backward direction
         * while iterator only in forward direction
         */

        List<Integer> s = new ArrayList<Integer>(10);

        for (int i= 0; i < 10; i++) {
            s.add(i);
        }

        Iterator iter = s.iterator();

        System.out.print("Using Iterator to print: ");
        while(iter.hasNext()) {

            System.out.print(iter.next()+" ");
        }

        ListIterator iter2 = s.listIterator();

        System.out.print("\n\nUsing ListIterator (Forward): ");
        while(iter2.hasNext()) {
            System.out.print( iter2.next() + " ");
        }

        System.out.print("\nUsing ListIterator (Backward): ");
        while(iter2.hasPrevious()) {
            System.out.print( iter2.previous() + " ");
        }
        System.out.println("\n*******************************************");

    }
}
