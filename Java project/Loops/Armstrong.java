public class Armstrong {
    public static String armStrong(int val){
        int temp=val;
        int temp1=val;
        int sum =0;
        int c=0;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        while(temp1>0){
            int result =temp1%10;
            int product =1;
            for(int i=0;i<c;i++){
                product=product*result;
            }
            sum=sum+product;
            temp1= temp1/10;
        }
        System.out.println(sum);
        if(sum==val){
            return "Armstrong";
        }
        else{
            return "Not ArmStrong";
        }
    }

    public static void main(String args[]){
        int num=153;
        System.out.println(armStrong(num));
        
        
    }
}
