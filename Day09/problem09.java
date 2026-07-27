public class problem09 {
    void arraySum() {
        int arr[] = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        problem09 obj = new problem09();
        obj.arraySum();
    }
}