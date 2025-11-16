public class Basics4 {
    //Global variable or non static variable need object creation to access it
    int value = 10;
    Boolean statement = true;
    char ch ='S';
    //static variable doesn't need object creation as it belongs class
    static float temp = 24.5f;
    static double salary = 25420;
    public static void main(String args[]){
        Basics4 obj1=new Basics4();
        System.out.println(obj1.value);
        Basics4 obj2=new Basics4();
        System.out.println(obj2.statement);
        Basics4 obj3=new Basics4();
        System.out.println(obj3.ch);
        System.out.println(temp);
        System.out.println(salary);
    }
}
