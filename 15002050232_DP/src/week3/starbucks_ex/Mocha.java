package week3.starbucks_ex;

public class Mocha implements IDrink {
    private double price = 22;
    @Override
    public double getPrice() {
        System.out.println("Mocha: "+price);
        return price;
    }
}
