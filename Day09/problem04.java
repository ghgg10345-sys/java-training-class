public class problem04 {
    void checkEven() {
        int num = 18;
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    public static void main(String[] args) {
        problem04 obj = new problem04();
        obj.checkEven();
    }
}