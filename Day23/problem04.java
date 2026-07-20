import java.util.Scanner;

public class problem04 {

    public static boolean canShip(int[] weights, int days, int capacity) {
        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return requiredDays <= days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = weights[0];
        int right = 0;

        for (int weight : weights) {
            if (weight > left) {
                left = weight;
            }
            right += weight;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int answer = shipWithinDays(weights, days);

        System.out.println("Minimum Ship Capacity = " + answer);

        sc.close();
    }
}
