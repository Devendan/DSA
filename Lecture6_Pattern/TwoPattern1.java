import java.util.Scanner;

public class TwoPattern1 {
    public static void main(String[] args) {
         Scanner src=new Scanner(System.in);
        int n=src.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();

         }
    }
    
}
