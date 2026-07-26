public class problem02 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
