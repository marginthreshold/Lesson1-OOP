package Seminar1;

import java.util.ArrayList;

public class WendingMachine {
    private String name = "default";
    protected ArrayList<Product> productList;

    public WendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct (Product product){
        productList.add(product);
    }

    public Product returnProduct(String name) {
        for (Product el : productList) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    public Product returnProduct(String name, int volume,int temperature){
        for (Product el: productList) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature)
                    return el;
            } else if (el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (var el: this.productList
             ) {
            System.out.println(el);
        }
    }

}
