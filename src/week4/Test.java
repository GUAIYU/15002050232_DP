package week4;

public class Test {
    public static void main(String[] args){
       MCache a = new MCache(new MemcachedClient());
       a.read();
       a.write();
       RCache b = new RCache(new Jedis());
       b.read();
       b.write();
        }


}
