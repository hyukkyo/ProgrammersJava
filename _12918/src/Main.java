class Solution {
    public boolean solution(String s) {
        // matches는 정규표현식에 해당하는지 확인하는 함수
        // [0-9] 숫자이고, {4}, {6}을 통해 네자리, 여섯자리 확인
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "a234";
        boolean output = s.solution(input);
        System.out.println(output);
    }
}