public class EvenNumbers {
    public static void Even_num(int x,int y){
        int i=++x;
        while(i<y){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=100;
        Even_num(a,b);
    }
}
