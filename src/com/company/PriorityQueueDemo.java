package com.company;

import java.util.PriorityQueue;

public class PriorityQueueDemo implements Comparable<PriorityQueueDemo>{

    final int priority;
    final String name;

    public PriorityQueueDemo(int p, String n){
        priority =p;
        name = n;
    }

    public String toString(){
        return priority +" "+ name;
    }

    /**
     * return -1 is to not replace
     * return 1 is to replace
     * return 0 is for equal
     * @param other
     * @return
     */
    public int compareTo(PriorityQueueDemo other){

        if(priority < other.priority) {
            return -1;
        }
        else {
            if(priority > other.priority) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args){
        /*
            Priority queue gives priority to the first number added
            and stores other values in random order
            but while removing, it takes out the one with highest priority
         */
        PriorityQueue<PriorityQueueDemo> pq = new PriorityQueue<>();
        pq.add(new PriorityQueueDemo(4,"Pratik"));
        pq.add(new PriorityQueueDemo(5,"Kabin"));
        pq.add(new PriorityQueueDemo(2,"Ujwal"));
        pq.add(new PriorityQueueDemo(3,"Dipak"));
        pq.add(new PriorityQueueDemo(3,"Dilip"));
        pq.add(new PriorityQueueDemo(1,"Pasha"));

        System.out.println(pq);

        while(!pq.isEmpty()){
            PriorityQueueDemo value = pq.remove();
            System.out.println(value);
        }

    }
}
