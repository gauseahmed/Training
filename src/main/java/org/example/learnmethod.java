package org.example;

public class learnmethod {
    public static void main(String[] args) {
       learnmethod var = new learnmethod();
       var.method1();
      String value= var.method2();
        System.out.println(value);
        method3();
    }
    public void method1()

    {
        System.out.println("Hello World method 1");
    }
    public String method2()
    {
        System.out.println("Hello World method 2");
        return "method2returntext";
    }
    public static void method3()
    {
        System.out.println(" method 3 direct accessed without object");
    }

}
