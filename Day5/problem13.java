package Day5;
import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                continue;
            }
            sc.close();
            System.out.println("Positive Number: " + num);
        }
    }
}