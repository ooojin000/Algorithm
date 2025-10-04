import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] sum = new long[n];
        sum[0] = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }

        long[] cnt = new long[m];
        long result = 0;

        for (int i = 0; i < n; i++) {
            int remainder = (int)(sum[i] % m);
            if (remainder == 0) {
                result++;
            }
            cnt[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (cnt[i] > 1) {
                result += (cnt[i] * (cnt[i] - 1) / 2);
            }
        }

        System.out.println(result);
    }
}
