package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java {
    public static void main(String[] args) {
        HashMap<emp, String> hm= new HashMap<>();
        emp e1= new emp(1, "Abc", 200);
        emp e2= new emp(1, "DEF", 200);
        ArrayList<emp> arr= new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        Stream<emp> list=  arr.stream().filter(s-> s.salary> 200);//.collect(Collectors.toList())
        System.out.println(list);
            //    forEach(s-> System.out.println(s.name));
//        hm.put(e1,e1.name);.
//        hm.put(e2,e2.name);

    }
}
class emp{
    int id;
    String name;
    int salary;

    public emp(int id, String  name, int salary){
        this.id=id;
        this.name=name;
        this.salary= salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        emp emp = (emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
