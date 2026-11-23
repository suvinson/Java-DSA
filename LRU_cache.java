import java.util.*;
class LRUCache {

    class Node
    {
        Node next, prev;
        int key , value;
        Node(int key , int value)
        {
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity ;
    private final Node tail , head;
    private final Map<Integer,Node> hs;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hs = new HashMap<>();
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(hs.containsKey(key))
        {
            Node node = hs.get(key);
            deleteNode(node);
            insertAfterHead(node);
            return node.value;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hs.containsKey(key))
        {
            Node node = hs.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        }
        else
        {
            if(hs.size() == capacity)
            {
                Node node = tail.prev;
                hs.remove(node.key);
                deleteNode(node);
            }
            Node node = new Node(key, value);
            hs.put(key, node);
            insertAfterHead(node);
        }
    }
    
    private void deleteNode(Node node)
    {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void insertAfterHead(Node node)
    {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
public class LRU_cache {
    public static void main(String[] args) {
        // Initialize LRU Cache with capacity of 2
        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println("Get 1: " + cache.get(1)); // Returns 10 (1 becomes most recently used)

        cache.put(3, 30); // Evicts key 2 (least recently used)
        System.out.println("Get 2: " + cache.get(2)); // Returns -1 (not found)

        cache.put(4, 40); // Evicts key 1
        System.out.println("Get 1: " + cache.get(1)); // Returns -1 (not found)
        System.out.println("Get 3: " + cache.get(3)); // Returns 30
        System.out.println("Get 4: " + cache.get(4)); // Returns 40
    }
}
