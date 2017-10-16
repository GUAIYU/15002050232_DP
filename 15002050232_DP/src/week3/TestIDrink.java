package week3;

public class TestIDrink {
    public static void main(String[] args){
        IDrink idrink1 =new Decorator( new Coffee());
        idrink1.getPrice();
        IDrink idrink2 = new Decorator(new Latte());
        idrink2.getPrice();
        IDrink idrink3 = new Decorator(new Mocha());
        idrink3.getPrice();
    }
}
