package week7;

public class DepartmentManager extends Handler {
  @Override
  public String handleRequest(double fee) {
    String res="";
    if (fee<1000){
      res="Department同意请求";
    }
    else {
      return this.successor.handleRequest(fee);
    }
    return res;
  }
}
