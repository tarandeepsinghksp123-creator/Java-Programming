package interfaces;
public class PaymentStatus {
    public static void main(String[] args) {
        Payment P = new UPI() ;
        P.pay(10000);
        P.getPaymentDetails();

        Payment p = new creditcard() ;
        p.pay(20000);
        p.getPaymentDetails();

    }
}
interface Payment {
    void pay(double amount);
    void getPaymentDetails ();
}
class UPI implements Payment {
    @Override 
    public void pay (double amount){
        System.out.println("Money transfer =" +amount);
    }
    @Override 
    public void getPaymentDetails (){
        System.out.println("Payment done by UPI");
    }

}
class creditcard implements Payment {
    @Override 
    public void pay (double amount){
        System.out.println("Money transfer =" +amount);
    }
    @Override 
    public void getPaymentDetails (){
        System.out.println("Payment done by Creditcard");
    }
    

}


    

