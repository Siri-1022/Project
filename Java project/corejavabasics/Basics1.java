class Basics1 {
     //Method with one Non static parameter
    public void display(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        String str="This is a Method with its signature";
        //Object creation for non static variable
        Basics1 obj = new Basics1();
        //method calling through object
        obj.display(str);
    }
}
