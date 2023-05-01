import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();
        // source를 length 길이만큼 잘라서 tokens에 추가

        for(int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if(endIndex > source.length()) // 범위 넘어가면 마지막 인덱스로
                endIndex = source.length();

            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }


    private int compress(String source, int length) {
        // 압축한 문자열의 길이 반환
        StringBuilder builder = new StringBuilder();
        String last = "";
        int count = 0;

        for(String token : split(source, length)) {
            if(token.equals(last)) {
                count++;
            } else {
                if(count > 1)
                    builder.append(count);
                builder.append(last);

                last = token;
                count = 1;
            }
        }
        if(count > 1)
            builder.append(count);
        builder.append(last);

        return builder.length();
    }

    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for(int length = 1; length <= s.length(); length++) {
            // 자를 문자열 길이로 반복. 1~길이까지
            int compressed = compress(s, length);
            if(compressed < min) {
                min = compressed;
            }
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "aabbaccc";
        int output = s.solution(input);
        System.out.println(output);
    }
}