package week7;

public class ProjectManager extends Handler {
  @Override
  public String handleRequest(double fee) {
    String res="";
    if (fee<500){
      res="Project同意请求";
    }
    else {
      return this.successor.handleRequest(fee);
    }
    return res;
  }
}
