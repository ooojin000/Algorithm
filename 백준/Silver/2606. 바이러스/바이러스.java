import java.util.Scanner;

class Main {
    public static int[][] node;
    public static boolean[] visited;
    
    public static int n, m;
    public static int result = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        node = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = node[b][a] = 1;
        }

        dfs(1);

        System.out.println(result - 1);
    }

    public static void dfs(int x) {
        visited[x] = true;
        result += 1;

        for (int i = 1; i <= n; i++) {
            if (node[x][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}