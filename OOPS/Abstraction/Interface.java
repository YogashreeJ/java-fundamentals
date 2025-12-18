package Abstraction;

interface Bank {//all methods of interface is by default public abstract
    void interestRate();
}

class SBI implements Bank {
    public void interestRate() {
        System.out.println("Interest rate is 7%");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.interestRate();
    }
}
