package Lecture10;

import java.util.Scanner;

public class pascalTriangle {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int n =src.nextInt();
        int c=0;
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                c = j;
            }

            for(int k=c-1;k>=1;k--){
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
    
}
