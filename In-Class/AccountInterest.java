//class
public class AccountInterest{
    
    //main method
    public static void main(String[] args) {
        
        //find interest on bank account given account balance and interest rate
        float Account = 1500.00f;
        float IR= .002f;
        float Interest= Account * IR;
        float Balance= Account + Interest;
        
        System.out.println("Account Balance =" + Balance);
        
    }
    }
