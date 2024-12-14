package com.pratice.core.multithreading;


class Demo extends Thread{

  volatile  int counter;

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            counter++;
            System.out.println(counter);
        }
    }
}
public class VolatileKeywordDemo  {

    public static void main(String[] args) {

        Demo demo1=new Demo();
        Demo demo2=new Demo();

        demo1.start();
        demo2.start();
    }



}
