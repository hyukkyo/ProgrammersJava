import java.util.HashMap;
import java.util.Map;

class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String start : participant) {
            map.putIfAbsent(start, 0);
            map.put(start, map.get(start) + 1);
        }
        // 이름 : 숫자 (동명이인이 있을 수 있으니)

        for (String end : completion) {
            int n = map.get(end) - 1;
            map.put(end, n);
            if(n == 1) {
                map.remove(end);
            }
        }


        return map.keySet().iterator().next();
        // Map을 Set으로 바꿔서 iterator로 순회, 가장 처음 것 next
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution.solution(participant, completion));
    }
}