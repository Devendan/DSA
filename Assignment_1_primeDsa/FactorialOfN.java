import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        int n=src.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
