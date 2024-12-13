package com.example.accountManagement.patterns;

/**

 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1

 */
public class Eleven {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            int k = i%2;
            for(int j=0; j<i ; j++)
            {
                System.out.print(k +" ");
                k = 1 - k;
            }
            System.out.println();
        }
    }
}
