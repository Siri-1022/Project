public class IncOrDec {
    public static void Incre_Operator(int value){
        //Pre increment
        System.out.println("Pre Increment: "+ ++value);
        //post increment
        System.out.println("Post Increment: "+ value++);
        //after post Increment
        System.out.println(value);
    }
    public static void Decre_Operator(int value){
        //Pre decrement
        System.out.println("Pre Decrement: "+ --value);
        //post decrement
        System.out.println("Post Decrement: "+ value--);
        //after post decrement
        System.out.println(value);
    }
    public static void main(String args[]){
        int num=10;
        Incre_Operator(num);
        Decre_Operator(num);
    }
}
