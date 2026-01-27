import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int a= src.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    
}
