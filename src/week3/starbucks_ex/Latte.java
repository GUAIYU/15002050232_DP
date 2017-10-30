package week3.starbucks_ex;

public class Latte implements IDrink {
    private double price = 33;
    @Override
    public double getPrice() {
        System.out.println("Latte: "+price);
        return price;
    }
}
