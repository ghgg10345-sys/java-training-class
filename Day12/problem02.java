package Day12;
public class problem02 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index.");
        }
        System.out.println("Program End");
    }
}