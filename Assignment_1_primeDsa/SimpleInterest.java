import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int p= src.nextInt();
        int r=src.nextInt();
        int t=src.nextInt();
        int SI=(p*r*t)/100;
        System.out.println(SI);
    }
    
}
