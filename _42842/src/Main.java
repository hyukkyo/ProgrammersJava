class Solution {
    public int[] solution(int brown, int yellow) {
        int width;
        int height;
        for(width = 3; width <= 5000; width++) {
            for(height = 3; height <= width; height++) {
                int boundary = (width + height - 2) * 2;
                int center = width * height - boundary;

                if(brown == boundary && yellow == center) {
                    return new int[] {width, height};
                }
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int input1 = 10;
        int input2 = 2;
        int[] output = s.solution(input1, input2);
        for(int i : output) {
            System.out.println(i);
        }
    }
}