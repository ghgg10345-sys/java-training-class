public class problem05 {
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int result = max(25, 18);
        System.out.println("Maximum = " + result);
    }
}