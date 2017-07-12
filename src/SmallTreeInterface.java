/**
 * Created by java on 12.07.2017.
 */
public interface SmallTreeInterface<K extends Comparable<K>, V> {
    void add(K key, V value);
    int size();
    void print();
}
