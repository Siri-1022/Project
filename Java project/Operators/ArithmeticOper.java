public class ArithmeticOper {
    public static int Add(int x,int y){
        return x+y;
    }
    public static int Sub(int x,int y){
        return x-y;
    }
    public static int Mul(int x,int y){
        return x*y;
    }
    public static int Div(int x,int y){
        return x/y;
    }
    public static void main(String args[]){
        int a=30;
        int b=50;
        System.out.println(Add(a,b));
        System.out.println(Sub(a,b));
        System.out.println(Mul(a,b));
        System.out.println(Div(a,b));

    }
}
