import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            }
            return s1.compareTo(s2);
        });
        return strings;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = {
                "sun",
                "bed",
                "car"
        };
        int n = 1;
        String[] output = solution.solution(strings, n);
        System.out.println(output.toString());
    }
}