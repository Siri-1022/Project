public class LogicalOper {
    public static void voteEligible(int age,boolean has_govtId){
        // && -> when both conditions are true
        if(age>18 && has_govtId){
            System.out.println("Eligible for vote");
        }
        // || -> when any one of the conditions are true
        else if(age>18 || has_govtId){
            System.out.println("Check the requirements");
        }
        // ! -> executes the reverse case of candition
        else if(!has_govtId){
            System.out.println("Get the govtId");
        }
    
    }
     
    public static void main(String args[]){
        // check for different values for all cases
        int age = 23;
        boolean Id = false;
        voteEligible(age,Id);

    }
}
