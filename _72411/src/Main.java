class Solution {
    private static class Course {
        public final String course;
        public final int occurences;

        private Course(String course, int occurences) {
            this.course = course;
            this.occurences = occurences;
        }
    }



    public String[] solution(String[] orders, int[] course) {
        // 재귀로 완전탐색 해서 코스요리 조합을 다 뽑으면서 검사한다.
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] orders = {
                "ABCFG",
                "AC",
                "CDE",
                "ACDE",
                "BCFG",
                "ACDEH"
        };
        int[] course = {2,3,4};
        String[] output = solution.solution(orders, course);
        System.out.println(output.toString());
    }
}