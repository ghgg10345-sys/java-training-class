package Day05;

public class problem10{
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
