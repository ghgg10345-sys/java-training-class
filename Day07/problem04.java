public class problem04 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 1},
                {9, 2, 7},
                {4, 6, 3}
        };
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println("Smallest = " + min);
    }
}