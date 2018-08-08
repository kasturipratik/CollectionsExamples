package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        IteratorDemo iteratorDemo = new IteratorDemo();
        QueueDemo queueDemo = new QueueDemo();
        SetDemo setDemo = new SetDemo();
        ListDemo listDemo = new ListDemo();


        listDemo.showList();
        setDemo.showSet();
        queueDemo.showQueue();
        iteratorDemo.showIterator();

    }
}