import java.util.Scanner;
public class DoremysPaint{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int s = 0; s< t; s++) {
        int l = sc.nextInt();
        int nums[] = new int[l];
        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }

        boolean flag=true;
        int n1 = nums[0];
        int n2=-1;
        for (int i = 1; i < l; i++) {
            if (nums[i] == n1) {
                continue;
            } else {
                n2 = nums[i];
                break;

            }
        }


        int c2 = 0;
        int c1 = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == n1) {
                c1++;
            } else if (nums[i] == n2) {
                c2++;
            } else {
                System.out.println("NO");
                flag = false;
                break;
            }
        }

        if (flag) {
            if (c1 == c2 || c1 == c2 + 1 || c2 == c1 + 1||c2==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
}
