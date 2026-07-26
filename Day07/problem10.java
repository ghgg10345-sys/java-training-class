public class problem10 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at Row " + i + " Column " + j);
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}