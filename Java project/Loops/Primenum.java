import java.util.Scanner;

public class Primenum {
    public static boolean isPrime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println(isPrime(value));
    }
}
