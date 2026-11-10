public class encapsulation {
    public static void main(String[] args) {
        Bankaccount b1 = new Bankaccount();
        b1.deposit(5000);
        b1.withdraw(2000);
        System.out.println(b1.getbalance());
        
    }    
}
class Bankaccount{
    private double balance = 0 ;
    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount ;
        }else {
            System.out.println("not a valid deposit amount");
        }

    }
    public void withdraw (double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount ;
            
        }else {
            System.out.println("invalid withdraw amount");
        }

    
    }
    public double getbalance(){
        return balance;
    }


}
