public class Even_Odd {
    public static String Even_or_Odd(int value){
        if(value%2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
        
    }
    public static void main(String args[]){
        int number = 13;
        System.out.println(Even_or_Odd(number));
    }
}
