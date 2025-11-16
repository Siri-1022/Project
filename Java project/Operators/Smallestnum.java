public class Smallestnum {
     public static void Check_Largest(int x,int y,int z){
        if(x>=y && x>=z){
            System.out.println("Largest value is: "+x);
        }
        else if(y>=z && y>=x){
            System.out.println("Largest value is: "+y);
        }
        else{
            System.out.println("Largest value is: "+z);
        }
    }
    public static void Check_Smallest(int x,int y,int z){
        if(x<=y && x<=z){
            System.out.println("Smallest value is: "+x);
        }
        else if(y<=z && y<=x){
            System.out.println("Smallest value is: "+y);
        }
        else{
            System.out.println("Smallest value is: "+z);
        }

    }

    public static void main(String args[]){
        int a=5;
        int b=12;
        int c=3;
        Check_Largest(a,b,c);
        Check_Smallest(a,b,c);

    }
}
