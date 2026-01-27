package AssingnmentHackerBlock2;

import java.util.Scanner;

public class TwoTriangle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        
		for(int i = 1 ; i<= n ; i++){
			for( int j = 1 ; j<= i; j++){
				System.out.print(j+"\t");
			}
			for(int j =1 ; j< 2*(n-i) ; j++){
				System.out.print(" \t");
			}

			for(int k =i ; k >= 1 ;k--){
				if(k == n) k--;
				System.out.print(k+"\t");
			}

			System.out.println();
		}


    }
    
}
