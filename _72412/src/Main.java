import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private void forEachKey(int index, String prefix, String[] tokens) {
        // 재귀로 검색 조건들을 전부 생성함.
        if (index == tokens.length - 1) { // 점수는 빼고

            return;
        }

        forEachKey(index + 1, prefix + tokens[index], tokens);
        forEachKey(index + 1, prefix + "-", tokens);

    }

    private Map<String, List<Integer>> buildScoresMap(String[] info) {
        Map<String, List<Integer>> scoresMap = new HashMap<>();

        for (String s : info) {
            String[] tokens = s.split(" ");
            int score = Integer.parseInt(tokens[tokens.length - 1]);

        }

        return scoresMap;
    }

    public int[] solution(String[] info, String[] query) {
        // 그냥 O(NM)으로 탐색하면 시간초과 발생
        // 따라서 '이진 탐색'을 적용해서 전처리를 해줌

    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] info = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"
        };
        String[] query = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100","- and - and - and - 150"
        };
        int[] result = solution.solution(info, query);
        System.out.println(result.toString());
    }
}