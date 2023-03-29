// 삼각 달팽이

class Solution {
    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v = 1;

        int x=0;
        int y=0;
        int d=0; // 방향변수

        while(true) {
            triangle[y][x] = v++;
            int nx = x + dx[d]; // 이전값에 변화량을 더함 -> 현재값
            int ny = y + dy[d];
            if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) { // 더이상 진행할수 없을때
                d = (d+1) % 3; // 다음 방향으로 변환
                nx = x + dx[d]; // 다음 방향으로 변경
                ny = y + dy[d];
                if(nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) // 이래도 진행이 안되면 종료
                    break;
            }
            x = nx;
            y = ny;

        }

        int[] answer = new int[v-1];
        int index = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int input = 4; // 5, 6
        int[] output = s.solution(input);
        for(int i=0; i< output.length; i++) {
            System.out.println(output[i]);
        }
    }
}