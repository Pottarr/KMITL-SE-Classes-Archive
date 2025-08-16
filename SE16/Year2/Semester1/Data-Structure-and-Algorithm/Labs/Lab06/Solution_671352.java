package Lab06;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_671352 {
    public int maxLandArea(int[][] grid) {
        int max = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    int area = bfs(grid, visited, r, c);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    private int bfs(int[][] grid, boolean[][] visited, int startR, int startC) {
        int[] dr = {-1, 1, 0, 0}; // up, down
        int[] dc = {0, 0, -1, 1}; // left, right
        int count = 0;
        /* your code */
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {startR, startC});
        while (!queue.isEmpty()) {
            int[] cur; int r, c;
            cur = queue.poll();
            count++;
            r = cur[0];
            c = cur[1];
            for (int nr : dr) {
                for (int nc : dc) {
                    if (isValid(grid, visited, r, c)) {
                        queue.offer(new int[]{nr, nc});
                        visited[r][c] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean isValid(int[][] grid, boolean[][] visited, int r, int c) {
        return r >= 0 && r < grid.length &&
        c >= 0 && c < grid[0].length &&
        grid[r][c] == 1 && !visited[r][c];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1},
            {1, 1, 0, 0}
        };
        Solution_671352 s = new Solution_671352();
        int result = s.maxLandArea(grid);
        System.out.println("Largest land area: " + result);
    }
}
