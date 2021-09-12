
import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache {
    public Set<Integer> cache = new LinkedHashSet<>(5);
    public int capacity = 5;


    public void get(int key) {
        cache.remove(key);
    }

    public void put(int key) {
        if (cache.contains(key)) {
            get(key);
        }
        chkCapacity(key);
    }

    public void chkCapacity(int key) {
        if (capacity == cache.size()) {
            int firstkey = cache.iterator().next();
            get(firstkey);
        }
        cache.add(key);
    }

    public void display() {
        for (int i : cache) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache();
        lru.put(5);
        lru.put(1);
        lru.put(2);
        lru.put(3);
        lru.put(7);
        lru.display();
        lru.put(4);
        lru.display();
    }

}
