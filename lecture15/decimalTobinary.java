package lecture15;

import java.util.Scanner;

public class decimalTobinary {

    public static int reverse(int k ){
        int res = 0 ;

        while(k != 0){
            int rev = k%10 ; 
            res = res*10 + rev ;
            k = k/10 ;
        }

        return res ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int bn = 1 ;
        while(n>0){
            int k = n%2 ;
            bn = bn*10 + k ;
            n = n/2 ;
        }
        int b=reverse(bn) ;
        System.out.println(b/10);
    }
    
}
