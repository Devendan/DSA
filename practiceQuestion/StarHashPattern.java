package practiceQuestion;

import java.util.Scanner;

public class StarHashPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;

        for( int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= n ; j++){
                int m = (1+n/2)  ;
                if(i == m && j == m) System.out.print("@ ");
                else if(i == n || j == n || i == 1 || j == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
    
}
