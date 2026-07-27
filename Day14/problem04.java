import java.util.LinkedList;
public class problem04 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Chennai");
        cities.add("Salem");
        cities.add("Madurai");
        if (cities.contains("Salem")) {
            System.out.println("City Found");
        } else {
            System.out.println("City Not Found");
        }
    }
}