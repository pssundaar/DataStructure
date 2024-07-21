package com.Basic.Java;

public class Singleton {
    private static Singleton singleton;
    private static String name;
    private Singleton(String name){
        this.name = name;
    };
    public static Singleton getObj(String name){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new Singleton(name);
                }
            }
        }
        return singleton;
    }

    public static String getName() {
        return name;
    }
}
