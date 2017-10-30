package week3;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(IDrink idrink){
        super(idrink);
    }
    public double getPrice(){
        System.out.println("具体装饰器");
        idrink.getPrice();
        return 0;
    }
}
