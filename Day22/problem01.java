public class problem01 {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }
    public static void main(String[] args) {
        problem01 obj = new problem01();

        System.out.println(obj.findTheDifference("abcd", "abcde"));
    }
}