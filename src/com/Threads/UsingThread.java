package com.Threads;

public class UsingThread extends  Thread{
    public void run(){
        System.out.println("i am in run meyhod");
    }

    public static void main(String[] args) {
        UsingThread ut = new UsingThread();
        ut.start();
        System.out.println(ut.getThreadGroup());
    }
}
