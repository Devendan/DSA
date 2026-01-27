import java.util.Scanner;

public class LotteryGame {
    public static void main(String [] args){
         Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        if(n>=300 && n<=460){
            System.out.println("MackBook");
        }
         else if(n>=200 && n<=280){
            System.out.println("Kurkure");
        }
         else if(n>=1100 && n<=1500){
            System.out.println("Cycle");
        }
         else if(n>=50 && n<=80){
            System.out.println("Bike");
        }else{
            System.out.println("Better luck next Time");
        }
    }
}
