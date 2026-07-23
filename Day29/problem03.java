import java.util.*;
public class problem03 {
    public static int findJudge(int n, int[][] trust) {
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];
        for (int[] t : trust) {
            outdegree[t[0]]++;
            indegree[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int n = 2;

        int[][] trust = {
            {1, 2}
        };

        System.out.println(findJudge(n, trust));
    }
}