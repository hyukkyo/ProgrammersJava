import java.util.Arrays;

class Solution {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1) // 내림차순으로 정렬
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        // collect(supplier, accumulator, combiner) 에서
        // accumulator에 append대신 appendCodePoint를 써야 문자열에 정수대신 문자가 들어감.
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "Zbcdefg";
        String output = s.solution(input);
        System.out.println(output);
    }
}