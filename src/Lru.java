import java.util.HashMap;
import java.util.Map;

public class Lru<K,V > {
    DoublyLinkedList<K,V> doublyLinkedList;
    Map<K,Node<K,V>> map;
    public Lru(int size) {
        this.doublyLinkedList = new DoublyLinkedList<>(size);
        this.map = new HashMap<>();
    }
    public void put(K key, V value){
        if(map.containsKey(key)) {
            doublyLinkedList.remove(map.get(key));
            doublyLinkedList.addFirst(map.get(key));
        }
        else{
            if(map.size()==doublyLinkedList.size){
                map.remove(doublyLinkedList.tail.prev.key);
                doublyLinkedList.removeLast();
            }
            Node<K,V> newNode = new Node<>(key, value);
            map.put(key,newNode);
            doublyLinkedList.addFirst(newNode);
        }
        return;
    }

    public int get(K key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node<K,V> node = map.get(key);
        doublyLinkedList.remove(node);
        doublyLinkedList.addFirst(map.get(key));
        return (int) node.value;
    }

}
