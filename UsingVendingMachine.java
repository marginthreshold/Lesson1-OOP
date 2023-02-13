package Seminar1;

import java.util.ArrayList;

public class UsingVendingMachine {
    public static void main(String[] args) {
        WendingMachine firstMachine = new WendingMachine("first machine");
        Product nuts = new Product("орешки", 100);
        Product cola = new Product("газировка", 150);
        firstMachine.addProduct(nuts);
        firstMachine.addProduct(cola);
        String newStr = firstMachine.returnProduct("орешки").getName();
        Integer newPrice = firstMachine.returnProduct("орешки").getPrice();
  //    System.out.println(newPrice+" "+newStr);

        Drink appleJuiceDrink = new Drink("сок яблоко", 100);
        appleJuiceDrink.setVolume(100);
        Drink cherryJuiceDrink = new Drink("сок вишня", 150);
        cherryJuiceDrink.setVolume(150);

        HotDrinksWendingMachine hotDrinksVM = new HotDrinksWendingMachine("горячие напитки");
        HotDrink capuchinoHotDrink = new HotDrink("капучино", 210);
        capuchinoHotDrink.setTemperature(70);
        capuchinoHotDrink.setVolume(150);
        HotDrink latteHotDrink = new HotDrink("latte", 190);
        latteHotDrink.setTemperature(70);
        latteHotDrink.setVolume(150);
        hotDrinksVM.addHotDrink(latteHotDrink);
        hotDrinksVM.addHotDrink(capuchinoHotDrink);

        firstMachine.addProduct(capuchinoHotDrink);
        System.out.println(firstMachine.returnProduct("капучино", 150, 70).getName());


        ArrayList<Product> products = new ArrayList<>();
        products.add(nuts);
        products.add(cola);
        products.add(appleJuiceDrink);
        products.add(cherryJuiceDrink);
        products.add(capuchinoHotDrink);
        products.add(latteHotDrink);
        for (Product el: products) {
            el.consume();
        }


    }
}