import java.util.Scanner;

public class MaximumOfTwoNum {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        int a= src.nextInt();
        int b=src.nextInt();

        if(a>b){
            System.out.println(a +" is Greater ");
        }else{
            System.out.println(b+"is Greater ");
        }
    }
}
