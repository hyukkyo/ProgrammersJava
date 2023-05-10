import java.util.stream.IntStream;

class Solution {
//    final static int[] supo1 = {1,2,3,4,5};
//    final static int[] supo2 = {2,1,2,3,2,4,2,5};
//    final static int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
//
//    private int[] maxArr(int p1, int p2, int p3) {
//        if(p1 < p2) {
//            // 2, 3 비교
//            if(p2 < p3) {
//                return new int[] {3};
//            } else if(p2 > p3) {
//                return new int[] {2};
//            } else {
//                return new int[] {2, 3};
//            }
//        } else if(p1 > p2) {
//            // 1, 3 비교
//            if(p1 < p3) {
//                return new int[] {3};
//            } else if(p1 > p3) {
//                return new int[] {1};
//            } else {
//                return new int[] {1, 3};
//            }
//        } else {
//            // 2, 3 비교
//            if(p2 < p3) {
//                return new int[] {3};
//            } else if(p2 > p3) {
//                return new int[] {1, 2};
//            } else {
//                return new int[] {1, 2, 3};
//            }
//        }
//    }
//
//    public int[] solution(int[] answers) {
//        int point1=0;
//        int point2=0;
//        int point3=0;
//        for(int i=0; i<answers.length; i++) {
//            if(answers[i%5] == supo1[i%5]) {
//                point1++;
//            }
//            if(answers[i%8] == supo2[i%8]) {
//                point2++;
//            }
//            if(answers[i%10] == supo3[i%10]) {
//                point3++;
//            }
//        }
//        return maxArr(point1, point2, point3);
//    }
    // 일부 케이스 불만족

    private static final int[][] RULES = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
    };

    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    } // 문제번호에 사람번호가 뭘 썼는지 반환

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for(int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];

            for(int person = 0; person < 3; person++) {
                int picked = getPicked(person, problem);
                if(answer == picked) {
                    if(corrects[person]++ > max)
                        max = corrects[person];
                }
            }
        }
        final int maxCorrects = max;
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i+1)
                .toArray();

    }

}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {1,3,2,4,2};
        int[] output = s.solution(input);
        for(int i : output) {
            System.out.println(i);
        }
    }
}