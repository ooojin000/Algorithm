import java.util.*;

class Main {
    static List<int[]> house = new ArrayList<>();
    static List<int[]> chicken = new ArrayList<>();
    static int[] selected;
    static int result = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    house.add(new int[]{i, j});
                } else if (arr[i][j] == 2) {
                    chicken.add(new int[]{i, j});
                }
            }
        }

        selected = new int[m];
        dfs(m, 0, 0);
        System.out.println(result);
    }

    public static void dfs(int m, int depth, int start) {
        if (depth == m) {
            result = Math.min(result, getDistance());
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            selected[depth] = i;
            dfs(m, depth + 1, i + 1);
        }
    }

    public static int getDistance() {
        int sum = 0;
        for (int[] h : house) {
            int minDist = Integer.MAX_VALUE;
            for (int idx : selected) {
                int[] c = chicken.get(idx);
                int dist = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
                minDist = Math.min(minDist, dist);
            }
            sum += minDist;
        }
        return sum;
    }
}