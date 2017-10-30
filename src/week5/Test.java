package week5;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Draw draw=new GrapicPoxy(new Grapic());
        Random random=new Random();
        Boolean b=random.nextBoolean();
        if (b){
            draw.draw();
        }else {
            draw.draw2();
        }

    }
}
