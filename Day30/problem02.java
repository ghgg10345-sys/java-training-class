import java.util.Arrays;
public class problem02 {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 2};

        System.out.println(largestPerimeter(nums));
    }
}