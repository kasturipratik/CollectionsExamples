package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public void showList(){


        // ArrayList and Linked List is same but their difference lies
        //on the time complexity. Add and remove is better in Linked List
        // but get is slower in Linked list than arraylist

        List<Integer> lst1 = new ArrayList<Integer>();

        lst1.add(2);
        lst1.add(6);
        lst1.add(4);
        lst1.add(8);
        lst1.add(2);

        System.out.println("**********************************");
        System.out.println("Arraylist:" + lst1);

        //faster to add and remove
        List<Integer> lst2 = new LinkedList<Integer>();

        lst2.add(2);
        lst2.add(6);
        lst2.add(4);
        lst2.add(8);
        lst2.add(2);

        System.out.println("LinkedList: " + lst2);
        System.out.println("********************************");

    }
}
