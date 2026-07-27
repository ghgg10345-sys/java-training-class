package Day12;
public class problem03 {
    public static void main(String[] args) {
        try {
            String str = "ABC";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number Format.");
        }
        System.out.println("Program End");
    }
}