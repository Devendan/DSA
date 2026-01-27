package AssingnmentHackerBlock2;

import java.util.Scanner;

public class hollowRect {
    public static void main(String args[]) {
        // Your Code Here
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int mid =(n+1)/2 ;
;
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n ; j++){
				
				if( i == 1 || j== n || i == n || j==1 ) {
					System.out.print("*\t");
				}
				else if(i == mid || j == mid ){
					System.out.print(" \t");
				}
				else{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
    }
    
}
