import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final char[] CHARS = "AEIOU".toCharArray();
    private void generate(String word, List<String> words) {
        words.add(word);

        if(word.length() == 5)
            return;

        for(char c : CHARS) {
            generate(word + c, words);
        }
    }

    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "AAAAE";
        int output = s.solution(input);
        System.out.println(output);
    }
}