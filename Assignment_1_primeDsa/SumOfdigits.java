import java.util.Scanner;

public class SumOfdigits {
    public static void main(String[] args) {
        Scanner src=new Scanner (System.in);
        int n=src.nextInt();
        int sum=0;
        while(n>1){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
