class Solution {
    boolean solution(String s) {
//        boolean answer = true;
//        int numP = 0;
//        int numY = 0;
//
//        for(char c : s.toCharArray()) {
//            if(c == 'p' || c == 'P') {
//                numP++;
//            } else if(c == 'y' || c == 'Y') {
//                numY++;
//            }
//        }
//
//        return numP == numY;

        s = s.toLowerCase(); // 전부 소문자로 치환

        int ps = s.length() - s.replace("p", "").length();
        int ys = s.length() - s.replace("y", "").length();
        return ps == ys;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "pPoooyY";
        boolean answer = solution.solution(s);
        System.out.println(answer);
    }
}