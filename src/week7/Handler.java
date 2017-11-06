package week7;

public abstract class Handler {
  protected Handler successor;

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }
  public abstract String handleRequest(double fee);

}
