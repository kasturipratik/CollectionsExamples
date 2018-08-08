package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public void showSet(){
        /**************************Set********************/
        /*
         * Set has no duplicates
         * HashSet is better than Linked HashSet and TreeSet in terms of complexity
         * TreeSet is slowest
         *
         */

        System.out.println("Hashset stores in random order" +
                "\nLinkedHashSet maintains the order" +
                "\ntreeset maintains sorted order\n ");

        HashSet<String> set1 = new HashSet<String>();

        set1.add("apple");
        set1.add("ball");
        set1.add("dog");
        set1.add("cat");
        set1.add("ball");

        System.out.println("HashSet: " + set1);

        LinkedHashSet<String> set2 = new LinkedHashSet<String>();

        set2.add("apple");
        set2.add("ball");
        set2.add("dog");
        set2.add("cat");
        set2.add("ball");
        System.out.println("LinkedHashSet:" + set2);


        TreeSet<String> set3 = new TreeSet<String>();

        set3.add("apple");
        set3.add("ball");
        set3.add("dog");
        set3.add("cat");
        set3.add("ball");
        System.out.println("TreeSet:" + set3);
        System.out.println("********************************************");

    }
}
