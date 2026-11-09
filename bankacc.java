public class bankacc {
    public static void main(String[] args) {
        bankaccount ba = new bankaccount();
        System.out.println(ba.getbalance());
        ba.deposit(500);
        ba.withdraw(300);
        
        System.out.println(ba.getbalance());

    }

}

class bankaccount {
    private double balance;

    public void deposit(int amount) {
        balance = +amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
    public double getbalance(){
        return balance; 
    }
}
