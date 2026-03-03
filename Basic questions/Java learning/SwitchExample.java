import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee: ");
        int emp = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter department");
        String dep = sc.nextLine();

        switch (emp) {
            case 1 -> System.out.println("Shivika Bisht");
            case 2 -> System.out.println("Vijay Bisht");
            case 3 -> {
                switch (dep) {
                    case "Management" -> System.out.println("Management");
                    case "IT" -> System.out.println("IT");
                    default -> System.out.println("Unknown Department");
                }
            }
            case 4 -> System.out.println("Kavita Bisht");
            default -> System.out.println("Who knows");
        }

        sc.close();
    }
}
