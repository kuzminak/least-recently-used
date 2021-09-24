import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

    private int capacity;
    private HashMap<Integer, Integer> map = new HashMap<>();
    private LinkedList<Integer> keyUsage = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer val = map.get(key);
        moveKeyToTop(key);
        if (val == null) {
            return -1;
        }
        keyUsage.add(key);
        return val;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && capacity <= map.size()) {
            int keyWithNoAccessForLongTime = keyUsage.getFirst();
            map.remove(keyWithNoAccessForLongTime);
        } else {
            moveKeyToTop(key);
        }

        keyUsage.add(key);
        map.put(key, value);
    }

    private void moveKeyToTop(int key){
        int position = keyUsage.indexOf(key);
        if(position == -1){
            return;

        }
        keyUsage.remove(position);
    }
}
