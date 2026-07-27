package Day12;
public class problem04 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is Null.");
        }
        System.out.println("Program End");
    }
}

