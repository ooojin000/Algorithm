import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class Pair {
        int doc, interview;
        Pair(int d, int i) { this.doc = d; this.interview = i; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine().trim());
            Pair[] arr = new Pair[N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int d = Integer.parseInt(st.nextToken());
                int iv = Integer.parseInt(st.nextToken());
                arr[i] = new Pair(d, iv);
            }

            Arrays.sort(arr, (a, b) -> Integer.compare(a.doc, b.doc));

            int cnt = 0;
            int bestInterview = Integer.MAX_VALUE;
            for (Pair p : arr) {
                if (p.interview < bestInterview) {
                    cnt++;
                    bestInterview = p.interview;
                }
            }

            out.append(cnt).append('\n');
        }

        System.out.print(out.toString());
    }
}