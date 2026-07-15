import java.util.*;
public class problem07 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        problem07 obj = new problem07();
        int[] nums1 = {0, 1};
        System.out.println(obj.findMaxLength(nums1));
        int[] nums2 = {0, 1, 0};
        System.out.println(obj.findMaxLength(nums2));
        int[] nums3 = {0, 1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println(obj.findMaxLength(nums3));
    }
}