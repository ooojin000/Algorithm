import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] spend;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        spend = new int[N];

        int low = 0;
        long high = 0;

        for (int i = 0; i < N; i++) {
            spend[i] = Integer.parseInt(br.readLine().trim());
            low = Math.max(low, spend[i]);
            high += spend[i];
        }

        long l = low, r = high;
        while (l < r) {
            long mid = (l + r) / 2;
            if (withdrawCount(mid) <= M) r = mid;
            else l = mid + 1;
        }
        System.out.println(l);
    }

    static int withdrawCount(long K) {
        int cnt = 0;
        long cash = 0;
        for (int x : spend) {
            if (cash < x) {
                cnt++;
                cash = K;
            }
            cash -= x;
            if (cnt > M) return cnt;
        }
        return cnt;
    }
}