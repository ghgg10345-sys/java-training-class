import java.util.HashSet;
public class problem02 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int count = 0;

        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        problem02 obj = new problem02();

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(obj.numJewelsInStones(jewels, stones));
    }
}