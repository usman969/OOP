
package l4hac2.L4HAC2;


public class Account {
    
     private int balance;
    
    
    public Account(){
        balance = 0;
    }
    
    public Account(int a){
        balance = a;
    }
    
    public void withdraw(int x){
        balance = balance - x;
    }
    
    public void deposit(int y){
        balance = balance + y;
    }
    
    public void setBalance(int bal){
        balance = bal;
    }
    
    public int getBalance(){
        return balance;
    }
    
    
}
