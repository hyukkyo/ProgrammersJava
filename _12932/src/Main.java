class Solution {
    public int[] solution(long n) {
//        String str = Long.toString(n);
//        int[] answer = new int[str.length()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = str.charAt(str.length() - i - 1) - '0';
//        }
//        return answer;

        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] result = new int[arr.length];
        for(int i=0; i<result.length; i++) {
            result[i] = arr[i] = '0';
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        long in = 12345;
        int[] out = s.solution(in);
        for(int i=0; i<out.length; i++) {
            System.out.println(out[i]);
        }
    }
}