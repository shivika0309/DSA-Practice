import java.util.Arrays;

public class PassExample {
    public static void main(String[] args) {
        int[] arr = {4, 5};

        change(arr);
        System.out.println(Arrays.toString(arr));   // [6, 5]

        changeRef(arr);
        System.out.println(Arrays.toString(arr));   // [6, 5]
    }

    static void change(int[] num) {
        num[0] = 6;
    }

    static void changeRef(int[] nums) {
        nums = new int[]{1, 2};
    }
}
