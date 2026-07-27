import java.util.ArrayList;
public class problem04 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chennai");
        cities.add("Madurai");
        cities.add("Salem");
        cities.set(1, "Coimbatore");
        System.out.println(cities);
    }
}