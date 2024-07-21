package com.Threads;

public class UsingRunnable implements Runnable{
    public void run(){
        System.out.println("i am in runnable run method");
    }

    public static void main(String[] args) {
        UsingRunnable ur= new UsingRunnable();
        Thread t1= new Thread(ur);
        t1.start();
    }
}
// create-> Runable running-> dead
//                 -> non runnable state-> runable-> running
