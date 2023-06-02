import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] numbers) {
//        Set<Integer> set = new TreeSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
//        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        int[] answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;

    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2,1,3,4,1};
        int[] output = s.solution(numbers);
        System.out.println(Arrays.toString(output));
    }
}