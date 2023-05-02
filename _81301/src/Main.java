public class Main {
    class Solution {
        private static final String[] numbers = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        public int solution(String s) {

            for(int i=0; i<numbers.length; i++) {
                s = s.replace(numbers[i], Integer.toString(i));
            }
            return Integer.parseInt(s);
        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "one4seveneight";
        int output = s.solution(input);
        System.out.println(output);
    }
}