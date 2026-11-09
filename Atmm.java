public class Atmm {
    public static void main (String[] args){
        Atm A1 = new Atm();
        A1.withdraw(1234, 5000);
        A1.checkbalance();
    }  
}
class Atm {
    private int pin = 1234 ;
    private double balance = 7000 ;
    public boolean verifypin(int enterdpin){
        return pin == enterdpin;
    }
    public void withdraw(int enterdpin , double amount){
        if (verifypin(enterdpin)){
            if (amount > 0 && amount<=balance){
                balance = balance - amount ;
            }else {
                System.out.println("invalid withdraw amount");
            }
            
        }else {
            System.out.println("invalid pin");
        }
        }
        public void checkbalance(){
            System.out.println(balance);
    }
}
