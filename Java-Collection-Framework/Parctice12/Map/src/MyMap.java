import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyMap<K, V> {
    private final List<Entry<K, V>> entries;

    public MyMap() {
        entries = new ArrayList<>();
    }

    public V put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (Objects.equals(entry.key, key)) {
                V oldValue = entry.value;
                entry.value = value;
                return oldValue;
            }
        }
        entries.add(new Entry<>(key, value));
        return null;
    }

    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (Objects.equals(entry.key, key)) {
                return entry.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (Objects.equals(entries.get(i).key, key)) {
                V value = entries.get(i).value;
                entries.remove(i);
                return value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (Entry<K, V> entry : entries) {
            if (Objects.equals(entry.key, key)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(V value) {
        for (Entry<K, V> entry : entries) {
            if (Objects.equals(entry.value, value)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return entries.size();
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public void clear() {
        entries.clear();
    }

    public List<K> keySet() {
        List<K> keys = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            keys.add(entry.key);
        }
        return keys;
    }

    public List<V> values() {
        List<V> values = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            values.add(entry.value);
        }
        return values;
    }

    public List<Entry<K, V>> entrySet() {
        return entries;
    }
}