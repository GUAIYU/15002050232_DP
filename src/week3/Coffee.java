package week3;
//创建实现接口的实体类，相当于rectangle
public class Coffee implements IDrink {
    private double price = 11;
    @Override
    public double getPrice() {
        System.out.println("Coffee: "+price);
        return price;
    }
}
