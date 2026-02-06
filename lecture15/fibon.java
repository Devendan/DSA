package lecture15;

import java.util.Scanner;

public class fibon {

    public static int fibonacci (int g){
        if (g ==0 || g == 1) {
            return g ;
        }

        return fibonacci(g-2) + fibonacci(g-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        for( int i=0  ; i< n ; i++ )
        System.out.print(fibonacci(i)+"  ");
        
    }
    
}
