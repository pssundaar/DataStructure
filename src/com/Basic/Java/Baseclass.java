package com.Basic.Java;

public class Baseclass
{ 
  int x = 20; 
// Overridden method. 
   void msg()
   { 
      System.out.println("Base class method"); 
   } 
 } 
 class Childclass extends Baseclass
{ 
  int x = 50; 
  int y = 100; 
// Overriding method. 
   void msg()
   { 
     System.out.println("Child class first method"); 
   } 
void msg2()
{ 
   System.out.println("Child class second method"); 
 } 
} 
 class MyTest extends Childclass {
    public static void main(String[] args) {
        Childclass obj = new Childclass();
        System.out.println("Value of x: " + obj.x); // x of class Childclass is called.
        obj.msg(); // msg() of Childclass is called.
        obj.msg2(); // msg2() of Childclass is called.

        Baseclass obj2 = new Childclass();
        System.out.println("Value of x: " + obj2.x); // x of Baseclass is called.
// System.out.println("Value of y: " +obj2.y); // Error because y does not exist in Baseclass. 
        obj2.msg(); // msg() of Childclass is called.
//
    }
}