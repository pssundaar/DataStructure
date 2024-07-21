package com.Hima;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;

public class JavaExceptionExample  extends A{
    public void hello(String s){
        System.out.println(s);
    }
    public static void main(String args[]) {

    }
}
  class A{
  private void hello(String s){
            System.out.println(s);
        }
  }
