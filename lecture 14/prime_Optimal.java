import java.util.Scanner;

public class prime_Optimal {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false ;
        for( int i= 2 ; i< Math.sqrt(n) ; i++){
            if(n % i == 0){
                 flag = false ;
                 break ;
            }
            else{
                flag = true ;
            }
        }

        if(flag){ 
            System.out.println("Prime ");
        }else{
            System.out.println("not Prime ");
        }
    }
    
}
