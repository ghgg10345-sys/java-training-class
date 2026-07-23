import java.util.*;
public class problem01 {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int left = 0;
        int right = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (count[ch] > 0) {
                required--;
            }
            count[ch]--;
            right++;
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char leftChar = s.charAt(left);
                count[leftChar]++;
                if (count[leftChar] > 0) {
                    required++;
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(minWindow(s, t));
        sc.close();
    }
}