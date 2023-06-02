import java.util.Arrays;

class Solution {
    private boolean isValid(int[] citations, int h) {
        int index = citations.length - h;
        return citations[index] >= h;
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int h = citations.length; h >= 1; h--) {
            if (isValid(citations, h)) return h;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] citations = {3,0,6,1,5};
        int output = s.solution(citations);
        System.out.println(output);
    }
}