package controller;

public class CreditCardAlgo implements Payment{
    private String name;
    private String cardNumber;

    public CreditCardAlgo(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +"Paid with card");
    }
}
