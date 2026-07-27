import java.util.LinkedList;
public class problem02 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.addFirst("Banana");
        fruits.addLast("Mango");
        System.out.println(fruits);
    }
}