package Day4;

public class problem11 {
    
    public static void main(String[] args) {
        int n = 98765;
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Count: " + count);
    }
}
