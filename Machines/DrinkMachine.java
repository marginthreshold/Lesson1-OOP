package Seminar1.Machines;


import Seminar1.Product.Drink;

public class DrinkMachine<T extends Drink> extends WendingMachine {
    public DrinkMachine(String drinkMachine) {
        super(drinkMachine);
    }

}
