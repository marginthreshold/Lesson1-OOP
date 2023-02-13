package Seminar1;

public class HotDrink extends Drink {
    private int temperature;

    HotDrink(String name, int price) {
        super(name, price);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void consume() {
        System.out.println("Горячий напиток выпит");
    }
}

