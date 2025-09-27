public class CacheFactory {
    public static <K,V> CacheType<K,V> GenerateCache(String CacheType,int size){
        CacheType<K,V> cacheType;
        switch(CacheType){
            case "LRU":
                cacheType= new Lru<>(size);
                break;
            default:
                throw new IllegalArgumentException("Cache type not found");
        }
        return cacheType;
    }
}
