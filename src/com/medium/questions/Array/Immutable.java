package com.medium.questions.Array;

public final class Immutable {
    private String name;
    private int number;

    Immutable(String name, int number){
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }



    public int getNumber() {
        return number;
    }



    public static void main(String[] args) {
        Immutable obj= new Immutable("shyam",2022);

        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getNumber());


        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getNumber());

    }
}
