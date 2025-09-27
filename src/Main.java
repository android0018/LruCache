//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lru<Integer,Integer> lru = new Lru<>(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.put(4, 4);
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        lru.put(5, 5);
        System.out.println(lru.get(2));
    }
}