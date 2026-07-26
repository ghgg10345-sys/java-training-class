public class problem03 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 1},
                {9, 2, 7},
                {4, 6, 3}
        };
        int max = arr[0][0];

        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("Largest = " + max);
    }
}