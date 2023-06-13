import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int n : numbers) {
            set.add(n);
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            if (set.contains(i))
                continue;
            sum += i;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution.solution(numbers));
    }
}