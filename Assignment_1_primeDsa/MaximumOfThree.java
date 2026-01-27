import java.util.Scanner;

public class MaximumOfThree {

    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();

        if(a>b && a>b){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
    

