package week7;

public class TestFee {
  public static void main(String[] args) {
    Handler h1=new ProjectManager();
    Handler h2=new DepartmentManager();
    Handler h3=new GeneralManager();
    h1.setSuccessor(h2);
    h2.setSuccessor(h3);
    String res=h1.handleRequest(600);
    System.out.println(res);
  }
}
