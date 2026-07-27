import java.util.ArrayList;
public class problem03 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Kaviya");
        students.add("Anu");
        students.add("Priya");
        if (students.contains("Anu")) {
            System.out.println("Student Found");
        } else {
            System.out.println("Student Not Found");
        }
    }
}
