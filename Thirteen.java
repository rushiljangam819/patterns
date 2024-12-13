package com.example.accountManagement.patterns;

/**
1         1
1 2     2 1
1 2 3 3 2 1

 */
public class Thirteen {

    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++){
            int space = (n-i)*2;
            {
                for (int j = 1; j <= i; j++)
                    System.out.print(j);
                for (int j = 1; j <= space; j++)
                    System.out.print(" ");
                for (int j = i; j >= 1; j--)
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}


//for (int i=1; i<4; i++){
//        for(int j=1; j<4;j++)
//        {
//        if(j<=i)
//        System.out.print(j);
//        else
//        System.out.print(" ");
//        }
//        for(int j=3; j>0;j--)
//        {
//        if(j<=i)
//        System.out.print(j);
//        else
//        System.out.print(" ");
//        }
//        System.out.println();
//        }