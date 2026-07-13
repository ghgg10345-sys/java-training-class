package Day21;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
