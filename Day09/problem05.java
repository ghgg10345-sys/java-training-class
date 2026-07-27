public class problem05 {
    void table() {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        problem05 obj = new problem05();
        obj.table();
    }
}