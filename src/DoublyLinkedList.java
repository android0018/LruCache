public class DoublyLinkedList<K,V>{
    Node<K,V> head;
    Node<K,V> tail;
    int size;
    public DoublyLinkedList(int size){
        this.size = size;
        head= new Node<>(null,null);
        tail= new Node<>(null,null);
        head.next= tail;
        tail.prev= head;
    }
    public void addFirst(Node<K,V> node){
        Node<K,V> second= head.next;
        head.next= node;
        node.prev= head;
        node.next= second;
        second.prev= node;
        return;
    }
    public void removeLast(){
        if(head.next==tail){
            return;
        }
        Node<K,V> secondLast=tail.prev.prev;
        secondLast.next =tail;
        tail.prev = secondLast;
        return;
    }
    public void remove(Node<K,V> node){
        Node<K,V> prev=node.prev;
        Node<K,V> next=node.next;
        prev.next = next;
        next.prev = prev;
        return;
    }
    public void removeAndAddFirst(Node<K,V> node){
        remove(node);
        addFirst(node);
        return;
    }

}
