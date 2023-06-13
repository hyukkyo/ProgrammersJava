import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> characterSet = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (characterSet.contains(c))
                continue;
            characterSet.add(c);
            builder.append(c);
        }

        return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "people";
//        String my_string = "We are the world";

        System.out.println(solution.solution(my_string));

    }
}