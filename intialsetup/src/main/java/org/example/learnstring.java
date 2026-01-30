package org.example;

import java.util.Arrays;

public class learnstring {
    public static void main(String[] args) {
        /*String name="Aslam";   //string declare method 1
        String name2=new String("Aslam Gause Testing");  //string declare method 2
        System.out.println(name2);
        //write in reverse order
        for (int i= name2.length()-1;i<=name2.length();i--) //reverse string
        {
            System.out.println(name2.charAt(i));
        }*/
        String name3= "Aslam Gau Test";
        String[] splitt=name3.split("Gau"); //Split the string
        System.out.println(splitt[0]);
        System.out.println(splitt[1]);
        System.out.println(splitt[2]);

    }
}
