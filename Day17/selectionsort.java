package Day17;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 15};
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("Array in Descending Order:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}

