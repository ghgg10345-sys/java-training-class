package Day05;
import java.util.Scanner;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println(num);
        }
        sc.close();
        System.out.println("Program Ended");
    }
}
