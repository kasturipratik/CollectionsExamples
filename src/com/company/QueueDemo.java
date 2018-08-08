package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public void showQueue(){
        //Queue
        /*
         * Has duplicates, FIFO rule
         * usually done using Linked list
         */
        Queue<String> q = new LinkedList<String>();

        q.add("apple");
        q.add("ball");
        q.add("dog");
        q.add("cat");
        q.add("ball");
        System.out.println("Queue:" + q);
        System.out.println("\nRemove in queue: " + q.remove() +
                "\nHead in Queue: " + q.peek() +
                "\nRemove head in queue: " + q.poll() +
                "\nQueue after remove: " + q);

        //PriorityQueue
        /*
         * Based on the priority, doesn't care about FIFO or LIFO
         * For example: If we have to do multiple tasks, we tend to do
         * tasks which are of most priority soon than those with least priority
         * Similar is the concept of priority queue
         */

        PriorityQueue<String> q1 = new PriorityQueue<String>();

        q1.add("apple");
        q1.add("ball");
        q1.add("dog");
        q1.add("cat");
        q1.add("ball");

        System.out.println("\nPriority queue: "+ q1);
        System.out.println("Remove in priority queue: " + q1.remove() +
                "\nHead or the most priority value in priority Queue: " + q1.peek() +
                "\nRemove head in priority queue: " + q1.poll()+
                "Priority queue after removing: "+ q1);
        System.out.println("*****************************************\n");

    }
}
