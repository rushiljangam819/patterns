package com.example.accountManagement.patterns;

/**

 **********
 ****  ****
 ***    ***
 **      **
 *        *
 **      **
 ***    ***
 ****  ****
 **********

 */
public class Fourteen {
    public static void main(String[] args) {
        int n= 5;
        for (int i=0; i<n; i++){
            int k = (2*(n-i) +1);
            int space = i;
            for(int j=0; j<k/2 ; j++)
            {
                System.out.print("* ");
            }
            for(int j=0; j<space*2 ; j++)
            {
                System.out.print("  ");
            }
            for(int j=0; j<k/2 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
