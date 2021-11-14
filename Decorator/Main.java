import baseclass.IceCream;
import model.BasicIceCream;
import model.ChocolateIceCream;
import model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost "+basicIceCream.cost());

        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Adding vanilla - cost is: "+vanilla.cost());

        IceCream chocolate = new ChocolateIceCream(vanilla);
        System.out.println("Adding chocolate - cost is: "+chocolate.cost());

        IceCream mint = new ChocolateIceCream(chocolate);
        System.out.println("Adding mint - cost is: "+mint.cost());
    }
}
