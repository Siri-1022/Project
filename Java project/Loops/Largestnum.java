public class Largestnum {
    public static int Largest(int x,int y,int z){
        if(x>=y && x>=z){
            return x;
        }
        else if(y>=z && y>=x){
            return y;
        }
        else{
            return z;
        }
    }
    public static void main(String[] args) {
        int a=37;
        int b=12;
        int c=5;
        System.out.println(Largest(a,b,c)); 
    }
}
