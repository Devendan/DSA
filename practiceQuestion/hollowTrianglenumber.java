package practiceQuestion;

import java.util.Scanner;

public class hollowTrianglenumber {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
        int m = sc.nextInt() ;

        int n = 1+ (m/2);

        for( int i = 1 ; i <= n ; i++){
            for( int j = 1 ; j <= n-i ; j++ ){
                System.out.print("  ");
            }
            if(i <= 2)
            System.out.print(1);
            else{
                System.out.print(i-1);
            }

            if(i>=2){
                for( int j = 1; j < i ; j++){
                    System.out.print("  ");
                }
                if(i <= 2)
            System.out.print(1);
            else{
                System.out.print(i-1);
            }
            }

            System.out.println();
        }


    }
    
}
