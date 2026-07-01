package Day06;

public class problem13 {
    
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied Array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
