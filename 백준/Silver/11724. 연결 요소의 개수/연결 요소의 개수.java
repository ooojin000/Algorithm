import java.util.Scanner;

class Main {
    public static int[][] graph = new int[1001][1001];
    public static boolean[] visited = new boolean[1001];
    
    public static int V, E;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 간선 연결
            graph[a][b] = graph[b][a] = 1;
        }

        int result = 0;

        for (int i = 1; i <= V; i++) {
            if (visited[i] == false) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);
    }

    public static void dfs(int x) {
        if (visited[x] == true) {
            return;
        } else {
            visited[x] = true;
            
            for (int i = 1; i <= V; i++) {
                if (graph[x][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
}