package Day05;
import java.util.Scanner;
public class problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            int num= sc.nextInt();
            if(num==0){
                break;
            }
            System.out.println("Entered"+num);
        }
        sc.close();
        System.out.println("program ended"); 
    }
    
}
