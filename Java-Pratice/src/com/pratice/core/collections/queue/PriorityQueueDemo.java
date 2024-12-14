package com.pratice.core.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue=new PriorityQueue<Integer>();//Comparator.reverseOrder());
        System.out.println("Initial Size: "+queue.size());

        queue.add(10);
        queue.add(25);
        queue.add(15);

        System.out.println("After adding elements size: "+queue.size());
        for(int i: queue){
            System.out.print(i+" ");
        }

        // Printing the top element of PriorityQueue
        System.out.println("\n"+queue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(queue.poll());
        System.out.println("after op: ");
        for(int i: queue){
            System.out.print(i+" ");
        }
        // Printing the top element again
    //    System.out.println(queue.peek());
    }
}
