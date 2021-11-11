package controller;

public class PaypalAlgo implements Payment{
    private String email;
    private String password;

    public PaypalAlgo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" paid with Paypal");
    }
}
