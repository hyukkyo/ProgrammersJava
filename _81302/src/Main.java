class Solution {
    private static final int dx[] = {0, 0, -1, 1};
    private static final int dy[] = {-1, 1, 0, 0};

    private int countP(String[] room, int x, int y) {
        int count = 0;
        for(int d=0; d<4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length())
                continue;

            if(room[nx].charAt(ny) == 'P') {
                count ++;
            }
        }

        return count;
    }

    public int[] solution(String[][] places) {

        int[] answer = {1, 1, 1, 1, 1};

        for(int i=0; i<5; i++) {
            String[] waitingRoom = places[i];
            loop:
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    if(waitingRoom[j].charAt(k) == 'P' && countP(waitingRoom, j, k) >= 1) { // countP가 1이상이면 실패
                        answer[i] = 0;
                        break loop;
                    } else if(waitingRoom[j].charAt(k) == 'O' && countP(waitingRoom, j, k) >= 2) { // countP가 2이상이면 실패
                        answer[i] = 0;
                        break loop;
                    }
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] input = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        int[] output = s.solution(input);
        for(int i=0; i<output.length; i++) {
            System.out.println(output[i]);
        }
    }
}