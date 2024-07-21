package com.Hima;

public class Department {


    public void display_department(int depno) throws WrongFileNameException {
        if(depno == 1){
            System.out.println("Bank");
        }
        if(depno == 2){
            System.out.println("Health");
        }
    }


}
