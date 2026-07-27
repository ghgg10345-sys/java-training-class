public class problem06 {
    void largest() {
        int a = 15;
        int b = 40;
        if (a > b) {
            System.out.println("Largest = " + a);
        } else {
            System.out.println("Largest = " + b);
        }
    }
    public static void main(String[] args) {
        problem06 obj = new problem06();
        obj.largest();
    }
}