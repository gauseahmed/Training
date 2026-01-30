package org.example;

public class arrayandloop {
   public static void main(String[] args) {
        int[] array1 = new int[5]; //array declare method one
        array1[0] = 11;
        array1[1] = 12;
        array1[2] = 13;
        array1[3] = 14;
        array1[4] = 15;
        System.out.println(array1[2]);

        int[] array2 = {21, 22, 23, 24, 25};//array declare method one
        System.out.println(array2[2]);

        String[] s= {"Aslam","Gause","Arshan"}; //array declare String
        System.out.println(s[2]);

        for (int i = 0; i < array2.length; i++) //Looping statement
        {
            System.out.println(array2[i]);
        }

        for (String i:s)
        {
            System.out.println(i);
        }
    }
}