import Model.Product;
import controller.CreditCardAlgo;
import controller.PaypalAlgo;
import controller.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234",2500);
        Product shirt = new Product("235",850);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        cart.pay(new PaypalAlgo("abc@gmail.com", "Ansari"));
        cart.pay(new CreditCardAlgo("Zaid","2153563556"));
    }
}