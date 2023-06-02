import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++) {
//            int[] destArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(destArray);
//            answer[i] = destArray[commands[i][2]-1];
//        }
//        return answer;

        int[] answer = new int[commands.length];
        for (int i=0; i<answer.length; i++) {
            int[] command = commands[i];
            int from = command[0] - 1;
            int to = command[1];
            int k = command[2]-1;

            int[] sub = Arrays.copyOfRange(array, from, to);
            Arrays.sort(sub);
            answer[i] = sub[k];
        }
        return answer;
        
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        int[] output = s.solution(array, commands);
        System.out.println(Arrays.toString(output));
    }
}