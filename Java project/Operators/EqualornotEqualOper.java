public class EqualornotEqualOper {
     public static String Check(int n1,int n2){
    if(n1==n2) 
    {
        return "Equal";
    }
    //check for different values it will be 
    else if(n1 != n2)
    {
        return "Not equal";
    }
    return null;
}
    public static void main(String args[]){
        int num1=10;
        int num2 = 17;
        System.out.println(Check(num1,num2));
    }
}
