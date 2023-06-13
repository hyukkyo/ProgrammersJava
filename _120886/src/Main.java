import java.util.HashMap;
import java.util.Map;

class Solution {
    public Map<Character, Integer> toMap(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        return map;
    }
    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String before = "olleh";
        String after = "hello";
        System.out.println(solution.solution(before, after));
    }
}