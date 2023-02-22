package Seminar1.Machines;

import Seminar1.Product.HotDrink;

public class HotDrinksWendingMachine<T extends HotDrink> extends WendingMachine {

    public HotDrinksWendingMachine(String hotDrinkMachineName){
        super(hotDrinkMachineName);
    }

}
