package model;

import baseclass.IceCream;
import baseclass.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate Ice-cream!");
        return 50+super.cost();
    }
}
