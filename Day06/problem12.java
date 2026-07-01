package Day06;

public class problem12 {
    public static void main(String[] args) {
        int[] arr = {-2,5,-8,10,3};

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}