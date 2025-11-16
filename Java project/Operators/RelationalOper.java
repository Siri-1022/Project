public class RelationalOper {
    public static void Relational_Operator(int x,int y){
        if(x>y){
            System.out.println("x is greaterthan y");
        }
        else if(x>=y){
            System.out.println("x is greaterthan or equal to y");
        }
        else if(x<y){
            System.out.println("x is lessthan y");
        }
        else if(x<=y){
            System.out.println("x is lessthan or equal y");
        }
        else if(x==y){
            System.out.println("x is equals to y");
        }
        else{
            System.out.println("x not equal to y");
        }

}
public static void main(String args[]){
    //try different values for different outcomes
    int a=55;
    int b=27;
    Relational_Operator(a,b);
}
}
