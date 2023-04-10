class Solution {
    public String solution(String s, int n) {

//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0; i<s.length(); i++) {
//            int c = s.charAt(i);
//
//            if(c == ' ') {
//                sb.append((char)c);
//            } else if('A' <= c && c <= 'Z') {
//                if(c+n > 'Z')
//                    sb.append((char)(c+n-26));
//                else
//                    sb.append((char)(c+n));
//
//            } else if('a' <= c && c <= 'z') {
//                if(c+n > 'z')
//                    sb.append((char)(c+n-26));
//                else
//                    sb.append((char)(c+n));
//            }
//        }
//
//        String answer = sb.toString();
//        return answer;

        StringBuilder builder = new StringBuilder();
        for(char c : s.toCharArray()) {
            builder.append(push(c, n));
        }
        return builder.toString();
    }

    private char push(char c, int n) {
        if(!Character.isAlphabetic(c)) // 알파벳이 아니면 그냥 반환
            return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a'; // 대문자면 'A', 소문자면 'a' 저장
        int position = c - offset;
        position = (position + n) % ('Z'-'A'+1); // 26으로 한번 쳐내줌
        return (char) (offset + position);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input1 = "a B z";
        int input2 = 4;
        String output = s.solution(input1, input2);
        System.out.println(output);
    }
}