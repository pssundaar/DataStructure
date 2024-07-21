package com.Basic.Java;

public class SingletonEarlyInitilition {
    private static SingletonEarlyInitilition singleton= new SingletonEarlyInitilition();
    private SingletonEarlyInitilition(){};
    public static SingletonEarlyInitilition getObj(){
        return singleton;
    }
}
