public abstract class CacheType<K,V> {
    public abstract void put(K key, V value);
    public abstract int get(K key);
}
