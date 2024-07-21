package com.Basic.Java;


import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        student s= new student();
        s.setAge(25);
        s.setName("Manoj");
        s.setEmail("email");

            HashMap<String, student> capitalCities = new HashMap<String, student>();
            capitalCities.put("Manoj", s);

            //System.out.println(capitalCities);
            capitalCities.forEach((k,v)-> System.out.print(k +" - "+ v.getAge() +" "+v.getEmail()));
        }
        }


class student{
    String name;
    int age;
    String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}