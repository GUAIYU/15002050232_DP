package week3.starbucks_ex;

public class Coffee implements IDrink {
    private double price = 11;
    @Override
    public double getPrice() {
        System.out.println("Coffee: "+price);
        return price;
    }
}
