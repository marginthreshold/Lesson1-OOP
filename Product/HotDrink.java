package Seminar1.Product;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, int price) {
        super(name, price);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void consume() {
        System.out.println("Горячий напиток выпит");
    }
}

