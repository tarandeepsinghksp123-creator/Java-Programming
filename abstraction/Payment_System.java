public class Payment_System {
    public static void main(String[] args) {
        Payment P1 = new UPI_Payment();
        P1.paymentsuccess();
        P1.pay(500);

        Payment P2 = new Card_Payment();
        P2.paymentsuccess();
        P2.pay(1000);
    }
}

abstract class Payment {
    abstract void pay(double amount);

    void paymentsuccess() {
        System.out.println("Payment Sucessful");
    }
}

class UPI_Payment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment done by UPI");
        System.out.println("Money credited = " + amount);

    }
}

class Card_Payment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Payment done by Card");
        System.out.println("Money credited = " + amount);
    }
}