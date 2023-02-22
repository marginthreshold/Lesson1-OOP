package Seminar1.Product;

public class Drink extends Product {
    private int volume;
    public Drink(String name, int price) {
        super(name, price);
    }

    @Override
    public void consume() {
        System.out.println("напиток выпит");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
}
