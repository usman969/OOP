
public class Lab3_Homeactivity2_Runner {
    public static void main(String[] args){
        Account a1 = new Account();
        System.out.println(a1.deposit());
        
        Account a2 = new Account(60000,15000);
        System.out.println(a2.withdraw());
    
    }
    
}
