package week4;

public class RCache extends Jedis implements CacheInterface{
    private Jedis js;
    public RCache(Jedis js){
        this.js=js;
    }
    public void read(){
        super.readJedis();
    }
    public void write(){
        super.writeJedis();
    }
}
