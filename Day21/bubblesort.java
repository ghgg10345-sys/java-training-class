package Day21;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
