package week5;

import java.util.Random;

public class GrapicPoxy implements Draw{
    private Draw draw;
    public GrapicPoxy(Draw draw){
        this.draw=draw;
    }


    public void draw(){
        draw.draw();
    }
    public void draw2(){
        draw.draw2();
    }
}
