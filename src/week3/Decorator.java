package week3;

    public class Decorator implements IDrink {
        protected IDrink idrink;
        public Decorator(IDrink idrink) {
            this.idrink = idrink;
        }
        @Override
        public double getPrice(){
            System.out.println("装饰器：简单操作");
            idrink.getPrice();
            return 0;
        }
    }