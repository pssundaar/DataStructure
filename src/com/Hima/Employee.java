package com.Hima;

public class Employee  {

    public static void display_department(int depno) throws WrongFileNameException {
        if(depno ==0){
            throw  new WrongFileNameException("This file is wrong");
        }
    }

    public static void main(String[] args) throws WrongFileNameException {
        Employee.display_department(0);
    }
}


