package Seminar1.Machines;

import Seminar1.Product.HotDrink;
import Seminar1.Product.Product;

import java.util.ArrayList;

public class WendingMachine<T extends Product> {
    private String name = "default";
    protected ArrayList<T> productList;

    public WendingMachine(String wendingMachineName) {
        this.name = wendingMachineName;
        this.productList = new ArrayList<T>();
    }

    public void addProduct (T product){
        productList.add(product);
    }

    public T returnProduct(String name) {
        for (T el : productList) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    public T returnProduct(String name, int volume,int temperature){
        for (T el: productList) {
            if (el instanceof HotDrink) {
                HotDrink ht = (HotDrink) el;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature)
                    return el;
            } else if (el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (T el: this.productList) {
            System.out.println(el);
        }
    }

    public T getProductFromVM(int index){
        return this.productList.get(index);
    }

    public ArrayList<T> getProductList(){
        return this.productList;
    }

}
