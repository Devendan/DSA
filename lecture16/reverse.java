package lecture16;

import java.util.Scanner;

public class reverse {
    public static int reverse(int x) {
        
        int nint=0;
        return reverseInt( x , nint);
    }

    public static  int reverseInt(int x , int y){
       
        if(x==0){
            return y;
        }
        int rmdr=x%10;
        if(y>Integer.MAX_VALUE/10||y<Integer.MIN_VALUE/10) return 0;
        

        y= (y*10)+rmdr;
        return(reverseInt(x/10,y));
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        System.out.println(reverse(n));

    }

}

