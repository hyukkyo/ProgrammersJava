import java.util.ArrayList;
import java.util.List;

// 하노이의 탑
class Solution {
    private void hanoi(int n, int from, int to, List<int[]> process) {
        if(n==1) {
            process.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        hanoi(n-1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n-1, empty, to, process);
    }

    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int input = 2;
        int[][] output = s.solution(input);
        for(int i=0; i<output.length; i++) {
            for(int j=0; j<output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}