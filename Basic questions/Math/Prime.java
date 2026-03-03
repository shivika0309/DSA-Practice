import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        int cnt = 2;
        while (cnt * cnt <= n) {
            if (n % cnt == 0) {
                System.out.println("Not Prime");
                return;
            }
            cnt++;
        }

        System.out.println("Prime number");
    }
}
