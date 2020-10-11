package com.sujata.test;

public class MyThread implements Runnable{// can extend Thread by creating obj to call method(start)

    public static  int amount = 0;
    public static void main(String[] args) {
        MyThread myObj = new MyThread();
        Thread  thread = new Thread(myObj);
            thread.start();//starts to continue task outside of thread,  Runnable is interface so must use threads obj to
        //call method
//        System.out.println("The code is running outside of thread." + "  "+amount);
//        amount++;
//        System.out.println(amount);
//        amount++;

        while (thread.isAlive()) {
            System.out.println("Waiting......");
        }
        System.out.println("Main:"+"  "+amount);
        amount++;
        System.out.println("Main:" + "  "+ amount);


    }

    public void run() {
        //System.out.println("The code is running in thread." +"  "+ amount);
        amount++;
    }

}
