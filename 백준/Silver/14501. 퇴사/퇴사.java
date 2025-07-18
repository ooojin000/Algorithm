import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] T = new int[n + 1];
        int[] P = new int[n + 1];
        int[] dp = new int[n + 2];

        for (int i = 1; i <= n ; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            if (i + T[i] <= n + 1) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
        }

        int maxProfit = 0;
        for (int i = 1; i <= n + 1; i++) {
            maxProfit = Math.max(maxProfit, dp[i]);
        }

        System.out.println(maxProfit);
    }
}