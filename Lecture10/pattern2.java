package Lecture10;

import java.util.Scanner;

public class pattern2 {

     public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int n= src.nextInt();
//int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print(k+" ");
            }

            System.out.println();
        }

    }
    
}
