package week3;
//创建实现接口的实体类，相当于circle
public class Mocha implements IDrink {
    private double price = 22;
    @Override
    public double getPrice() {
        System.out.println("Mocha: "+price);
        return price;
    }
}