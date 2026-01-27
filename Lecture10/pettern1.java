package Lecture10;

import java.util.Scanner;

public class pettern1 {

    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int m= src.nextInt();
            int n=(m+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
