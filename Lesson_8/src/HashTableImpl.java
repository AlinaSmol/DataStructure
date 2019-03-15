import java.util.LinkedList;
import java.util.List;

public class HashTableImpl implements HashTable {

    public static final int INVALID_INDEX = -1;
    public static final Integer INVALID_COST = null;

    private class Entry {

        private Item key;
        private int value;

        public Entry(Item key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private LinkedList<Entry>[] data;
    private int size;
    private int maxSize;

    public HashTableImpl(int maxSize) {
        this.data = new LinkedList[maxSize];
        this.maxSize = maxSize;
    }

    private int hashFunc(int key) {
        return key % data.length;
    }

    @Override
    public boolean put(Item item, Integer cost) {
        if (size == maxSize) {
            return false;
        }

        int index = hashFunc(item.hashCode());
        if (data[index] == null) {
            data[index] = new LinkedList<Entry>();
            size++;
        }
        data[index].add(new Entry(item, cost));
        return true;
    }

    @Override
    public Integer get(Item item) {
        int index = indexOf(item);
        if (index == INVALID_INDEX) {
            return INVALID_COST;
        } else {
           return findEntryByItem(data[index], item).value;
        }

    }

    private int indexOf(Item item) {
        int index = hashFunc(item.hashCode());

        if (findEntryByItem(data[index], item) != null) {
            return index;
        }

        return -1;
    }

    @Override
    public boolean remove(Item item) {
        int index = indexOf(item);

        if (index != INVALID_INDEX) {

            data[index].remove(findEntryByItem(data[index], item));

            if (data[index].isEmpty()) {
                data[index] = null;
                size--;}
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println("-----------");
        for (int i = 0; i < data.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (data[i] != null) {
                for (Entry o : data[i]) {
                    sb.append(o);
                    sb.append("->");
                }
            }
            System.out.println(i + " = " + sb);
        }
        System.out.println("-----------");
    }

    protected int getStep(int key) {
        return 1;
    }

    private Entry findEntryByItem(List<Entry> data, Item item){
        if (data != null) {
            for (Entry o : data) {
                if (o.key.equals(item)) {
                    return o;
                }
            }
        }
        return null;
    }
}
