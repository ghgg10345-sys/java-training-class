import java.util.LinkedList;
public class problem05 {
    public static void main(String[] args) {
        LinkedList<Integer> marks = new LinkedList<>();
        marks.add(75);
        marks.add(80);
        marks.add(90);
        marks.add(95);
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
    }
}