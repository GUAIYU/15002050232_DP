package week01;

public class TicketMaker {
//    int b=1000;
    private static TicketMaker a = new TicketMaker();

    public static TicketMaker getNextTicketMakerNumber() {
        return a;
    }
//    public void setb(int b){
//        this.b=b;
//    }
    private TicketMaker() {
//        System.out.println(b);
//        b++;
//        this.b=b;
    }
}
