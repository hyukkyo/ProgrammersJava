class Solution {

//    private int removeZero(String s1) {
//        int lengthOne = 0;
//        for(int i=0; i<s1.length(); i++) {
//            if(s1.charAt(i) == '1') {
//                lengthOne++;
//            }
//        }
//        return lengthOne;
//    }
//
//    public int[] solution(String s) {
//        int count = 0;
//        int numRemovedZero = 0;
//        String s1 = s;
//
//        // s1 != "1" 이렇게 쓰면 안됨
//        while(!s1.equals("1")) {
//            int k = removeZero(s1);
//            numRemovedZero += (s1.length() - k);
//            s1 = Integer.toString(k, 2);
//            count++;
//        }
//
//        int[] answer = new int[2];
//        answer[0] = count;
//        answer[1] = numRemovedZero;
//        return answer;
//    }
    private int countZeros(String s) {
        int zeros = 0;
        for(char c : s.toCharArray()) {
            if(c == '0')
                zeros++;
        }
        return zeros;
    }

    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        while(!s.equals("1")) {
            int zeros = countZeros(s);
            loop += 1;
            removed += zeros;

            int ones = s.length() - zeros;
            s = Integer.toString(ones, 2);
        }

        return new int[] {loop, removed};
    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "110010101001";
        int[] answer = solution.solution(s);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}