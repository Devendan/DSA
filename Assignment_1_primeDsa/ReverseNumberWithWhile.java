import java.util.Scanner;

public class ReverseNumberWithWhile {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int rev=0;
        while(n>=1){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
