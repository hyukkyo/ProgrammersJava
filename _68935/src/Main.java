class Solution {
    public int solution(int n) {
//        String n3 = Integer.toString(n, 3);
//        StringBuffer sb = new StringBuffer(n3);
//        String n3r = sb.reverse().toString();
//        int answer = Integer.parseInt(n3r, 3);
//        return answer;

        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();
        return Integer.valueOf(reversed, 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int input = 45;
//        int input = 125;
        int output = s.solution(input);
        System.out.println(output);
    }
}