import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        int m=src.nextInt();

        if(m>=90) System.out.println("A Grade");

        else if(m<90 && m>=75) System.out.println("B Grade");

        else if(m<75 && m>=60) System.out.println("C Grade");

        else {
            System.out.println("Fail");
        }

        src.close();
    }
}
