import java.util.Scanner;

public class palindrome {
     public static boolean isPalindrome(String str){
        String s1=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start=0;
        int last=s1.length()-1;
        while(start<last){
            if(s1.charAt(start)!=s1.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
    }

}
