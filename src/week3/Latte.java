package week3;
//创建实现接口的实体类
public class Latte implements IDrink {
    private double price = 33;
    @Override
    public double getPrice() {
        System.out.println("Latte: "+price);
        return price;
    }
}