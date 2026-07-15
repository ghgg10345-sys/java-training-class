import java.util.*;

public class problem10 {

    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            int rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            count += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        problem10 obj = new problem10();

        int[] nums1 = {4, 5, 0, -2, -3, 1};
        int k1 = 5;

        System.out.println(obj.subarraysDivByK(nums1, k1));

        int[] nums2 = {5};
        int k2 = 9;

        System.out.println(obj.subarraysDivByK(nums2, k2));
    }
}