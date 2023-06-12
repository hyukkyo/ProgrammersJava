import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf) // 비교할 수 있도록 문자열로 변환
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reversed = Integer.parseInt(s2 + s1);
                    return reversed - original;
                })
                .collect(Collectors.joining("")) // 문자열들을 하나의 문자열로 구성
                .replaceAll("^0+", "0"); // 정규표현식으로 0까지 처리. 문자열 시작^에 0이 한개+이상 붙으면 전부 0으로
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {3,30,34,5,9};
        String output = solution.solution(numbers);
        System.out.println(output.toString());
    }
}