public class problem05 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                return false;
            }
            count[ch - 'a']--;
        }
        return true;
    }
    public static void main(String[] args) {
        problem05 obj = new problem05();
        System.out.println(obj.canConstruct("a", "b"));    
        System.out.println(obj.canConstruct("aa", "ab"));   
        System.out.println(obj.canConstruct("aa", "aab"));  
    }
}