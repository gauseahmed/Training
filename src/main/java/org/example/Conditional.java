package org.example;

public class Conditional {
   public static void main(String[] args) {
        int[] array1 = new int[5]; //array declare method one
        array1[0] = 11;
        array1[1] = 12;
        array1[2] = 13;
        array1[3] = 14;
        array1[4] = 15;
        for(int i=0;i<array1.length;i++)
        {
            if (array1[i]%2==0)                 // check multiply of 2
            {
                System.out.println(array1[i]);
            }
            else
            {
                System.out.println(array1[i]+ "this is not multiply by 2");
            }
        }
    }
}
