package week1;

public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker a = new TicketMaker();
    public static TicketMaker getInstance(){
        return a;
    }

    public synchronized int getNextTicketMakerNumber() {
        return ticket++;
    }

    private TicketMaker() {
    }
}
