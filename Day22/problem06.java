import java.util.*;
public class problem06 {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        problem06 obj = new problem06();
        int[] nums1 = {23, 2, 4, 6, 7};
        System.out.println(obj.checkSubarraySum(nums1, 6));
        int[] nums2 = {23, 2, 6, 4, 7};
        System.out.println(obj.checkSubarraySum(nums2, 6));
        int[] nums3 = {23, 2, 6, 4, 7};
        System.out.println(obj.checkSubarraySum(nums3, 13));
    }
}