class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        boolean toUpper = true;

        for(char c : s.toCharArray()) {
            if(!Character.isAlphabetic(c)) { // 공백일 경우. Character.isSpaceChar(c)도 됨.
                builder.append(c);
                toUpper = true; // 다음 문자는 무조건 대문자로
            } else {
                if(toUpper) {
                    builder.append(Character.toUpperCase(c));
                } else {
                    builder.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }

        return builder.toString();
    }

}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "try hello world";
        String output = s.solution(input);
        System.out.println(output);
    }
}