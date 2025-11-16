import java.util.Scanner;

public class EvenorOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        int rem=number%2;
        switch(rem){
            case 0 -> System.out.println("Even");
            case 1 -> System.out.println("Odd");
            default -> System.out.println("Error");
        }
    }
}
