public class problem08 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for (int g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
        }
        return max;
    }
    public static void main(String[] args) {
        problem08 obj = new problem08();
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println(obj.largestAltitude(gain1));
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(obj.largestAltitude(gain2));
    }
}