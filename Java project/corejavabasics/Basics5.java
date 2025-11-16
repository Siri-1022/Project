public class Basics5 {
    //Global variable
    //need object creation to access it
    int num = 25;
    public static int Sum(){
        int x=20;
        int y=40;
        return (x+y);
    }
    public static void main(String args[]){
        String name = "Siri";
        //Local variable
        //Does not need object creation
        System.out.println(name);

        Basics5 obj = new Basics5();
        System.out.println(obj.num);
        //method calling
        System.out.println(Sum());
        
        /*it throws an error as the scope of the variable 'x' is within the method 'Sum'
        can't access outside of the method
        //System.out.println(x);
        */
    }
}
