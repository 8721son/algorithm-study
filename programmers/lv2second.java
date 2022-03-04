package programmers;

import java.util.*;

public class lv2second {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println(solution(m, n, picture)[0]);
        System.out.println(solution(m, n, picture)[1]);
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < picture.length; i++){
            for (int j = 0; j < picture[0].length; j++){
                if (!visited[i][j] && picture[i][j] != 0){
                    maxSizeOfOneArea = Math.max(
                            bfs(i, j, picture, visited, picture[i][j]), maxSizeOfOneArea);
                    numberOfArea++;
                }
            }
        }



        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static int bfs(int cx, int cy, int[][] graph, boolean[][] visited, int color){
        int count = 1;
        visited[cx][cy] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{cx, cy});

        while (!queue.isEmpty()){
            int[] pop = queue.remove();
            int px = pop[0];
            int py = pop[1];

            for (int i = 0; i < 4; i++){
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx < 0 || nx >= graph.length || ny < 0 || ny >= graph[0].length){
                    continue;
                }

                if (!visited[nx][ny] && graph[nx][ny] == color) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
        return count;
    }
}