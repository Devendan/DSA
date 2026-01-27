import java.util.Scanner;

public class Count1ToN {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int n =src.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        src.close();
    }
    
}
