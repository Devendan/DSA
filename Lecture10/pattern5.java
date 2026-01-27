package Lecture10;

import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args) {
        Scanner src =new Scanner(System.in);
        int n= src.nextInt();



        for(int i =1;i<=n;i++){
            for(int j=n;j>=1;j--){
                int c=i;
                if(j == i){
                   System.out.print("* ");

                }else{
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    
}
}
