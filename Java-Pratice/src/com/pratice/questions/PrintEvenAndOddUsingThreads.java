package com.pratice.questions;

public class PrintEvenAndOddUsingThreads {

    static int limit;
    static int counter=1;
    PrintEvenAndOddUsingThreads(int limit){
        this.limit=limit;
    }

    public synchronized void printEvenNumber(){
        while (counter<=limit){
            if (counter%2==0){
                System.out.println(Thread.currentThread().getName()+" : "+counter);
                counter++;
                notifyAll();
            }
            else{
                try{
                    wait();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void printOddNumber(){
        while(counter<=limit){
            if (counter%2!=0){
                System.out.println(Thread.currentThread().getName()+" : "+counter);
                counter++;
                notifyAll();
            }
            else {
                try{
                    wait();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenAndOddUsingThreads printEvenAndOddUsingThreads=new PrintEvenAndOddUsingThreads(10);
        Thread thread1=new Thread(()->{
        printEvenAndOddUsingThreads.printOddNumber();
        });

        thread1.setName("Odd ");

        Thread thread2=new Thread(()->{
            printEvenAndOddUsingThreads.printEvenNumber();
        });

        thread2.setName("Even ");
        thread1.start();
        thread2.start();
    }
}
