import java.util.ArrayList;
public class problem02 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.remove("Blue");
        System.out.println(colors);
    }
}