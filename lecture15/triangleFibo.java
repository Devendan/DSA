package lecture15;

import java.util.Scanner;

public class triangleFibo {

    public static int fibonacci (int g){
        if (g ==0 || g == 1) {
            return g ;
        }

        return fibonacci(g-2) + fibonacci(g-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int p = fibonacci(0);
        for(int i = 1 ; i <= n ; i++ ){
            for( int j = 1 ; j <= i ; j++){
                System.out.print(fibonacci(p++)+" ");
            }

            System.out.println();
        }
    }
    
}
