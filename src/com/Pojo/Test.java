package com.Pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Employee e1= new Employee("Shyam","HYD",30,2000);
        Employee e9= new Employee("Shyam","HYD",30,600);
        Employee e2= new Employee("Shyam","HYD",25,800);
        Employee e3= new Employee("Shyam","HYD",25,9000);
        Employee e4= new Employee("Shyam","HYD",25,3000);
        List<Employee> l= new ArrayList<>();
        l.add(e1);l.add(e2);l.add(e3);l.add(e4);l.add(e9);
        List<Employee>l1=       l.stream().sorted((o1,o2 )-> (int)(o1.getSal() - o2.getSal()))
                .collect(Collectors.toList());
        l1.forEach(s->System.out.println(s.getSal()));
    //    System.out.println(l1);

//       List<Employee>ll= l.stream().filter(s-> s.getAge()>=30)
//                .map(i-> {
//                    Employee e= new Employee();
//                    e.setSal(i.getSal()*30);
//                    e.setAge(i.getAge());
//                    e.setName(i.getName());
//                    e.setAdd(i.getAdd());
//                    return e;
//                })
//                .collect(Collectors.toList());
//       ll.forEach(s->System.out.println(s.getName() +" "+s.getAge()+" "+s.getSal()+" "+s.getAdd()));

//        HashMap<Employee,Integer> hm = new HashMap<>();
//        hm.put(e1,1);
//        hm.put(e9,3);
//
//        hm.forEach((k,v) -> System.out.println(k.getName() +" "+k.getAdd()+" "+k.getAge() +" ->"+" "+ v));
//        HashMap<String, String> h= new HashMap<>();
//        h.put("hello","sam");
//        h.put("hello","sun");
//        h.forEach((k,v) -> System.out.println(k +" ->"+" "+ v));
    }
}
