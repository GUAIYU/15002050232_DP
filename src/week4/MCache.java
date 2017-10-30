package week4;

public class MCache extends MemcachedClient implements CacheInterface {
   private MemcachedClient mc;
    public MCache(MemcachedClient mc){
        this.mc=mc;
    }
    public void read(){
        mc.readMemcache();
    }
    public void write(){
        mc.writeMemcache();
    }
}
