import java.util.*;
class LFUCache {
    class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
    private Map<Integer, Pair<Integer,Integer>> cache;
    private Map<Integer, LinkedHashSet<Integer>> frequencies;
    private int minf;
    private int capacity ;

    private void insert(int key , int frequency , int value)
    {
        cache.put(key, new Pair<>(frequency,value));
        frequencies.putIfAbsent(frequency,new LinkedHashSet<>());
        frequencies.get(frequency).add(key);
    }
    public LFUCache(int capacity) {
        cache = new HashMap<>();
        frequencies = new HashMap<>();
        this.capacity = capacity;
        minf = 0;
    }
    
    public int get(int key) {
        Pair<Integer , Integer> frequencyAndValue = cache.get(key);
        if(frequencyAndValue == null)
        {
            return -1;
        }   
        final int frequency = frequencyAndValue.getKey();
        final Set<Integer> keys = frequencies.get(frequency);
        keys.remove(key);
        if(keys.isEmpty())
        {
            frequencies.remove(frequency);

            if(minf == frequency)
            {
                ++minf;
            }
        }
        final int value = frequencyAndValue.getValue();
        insert(key , frequency + 1 , value);
        return value;
    }
    
    public void put(int key, int value) {
        if(capacity <= 0)
        {
            return ;
        }   
        Pair<Integer , Integer> frequencyAndValue = cache.get(key);
        if(frequencyAndValue != null)
        {
            cache.put(key , new Pair<>(frequencyAndValue.getKey() , value));
            get(key);
            return;
        }
        if(capacity == cache.size())
        {
            final Set<Integer> keys = frequencies.get(minf);
            final int keyToDelete = keys.iterator().next();
            cache.remove(keyToDelete);
            keys.remove(keyToDelete);
            if(keys.isEmpty())
            {
                frequencies.remove(minf);
            }
        }
        minf = 1;
        insert(key , 1 , value);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LFU_cache {
    public static void main(String arg[])
    {
        LFUCache cache = new LFUCache(2);

    cache.put(1, 1);
    cache.put(2, 2);

    System.out.println(cache.get(1)); // 1

    cache.put(3, 3);

    System.out.println(cache.get(2)); // -1
    System.out.println(cache.get(3)); // 3

    cache.put(4, 4);

    System.out.println(cache.get(1)); // -1
    System.out.println(cache.get(3)); // 3
    System.out.println(cache.get(4)); // 4
    }
}
