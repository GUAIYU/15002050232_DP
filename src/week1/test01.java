package week1;

public class test01 {

    public static void main(String []args){
        for (int i=1;i<=5;i++){
            System.out.println(1+TicketMaker.getInstance().getNextTicketMakerNumber());
        }

    }

}
