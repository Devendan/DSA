package lecture15;

import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 0 ;
        int sum = 0 ; 

        while( n > 0 ){
            int k = n%10 ;
            sum += k*Math.pow(2, p);
            p++ ;
            n = n/10 ; 
        }

        System.out.println(sum);
    }
    
}
