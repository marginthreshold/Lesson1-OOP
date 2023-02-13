package Seminar1;

import java.util.ArrayList;

public class HotDrinksWendingMachine extends WendingMachine {
    private ArrayList<HotDrink> hotDrinkList;

    public HotDrinksWendingMachine(String firstMachine){
        super(firstMachine);
        hotDrinkList= new ArrayList<HotDrink>();
    }

    public void addHotDrink(HotDrink hotDr) {
        hotDrinkList.add(hotDr);
    }
}
