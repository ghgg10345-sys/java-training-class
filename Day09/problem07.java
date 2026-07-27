public class problem07 {
    void factorial() {
        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
    public static void main(String[] args) {
        problem07 obj = new problem07();
        obj.factorial();
    }
}