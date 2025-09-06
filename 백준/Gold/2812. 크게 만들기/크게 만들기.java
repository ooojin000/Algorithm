import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine().trim();

        char[] stack = new char[n];
        int size = 0;
        int K = k;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            while (K > 0 && size > 0 && stack[size - 1] < c) {
                size--;
                K--;
            }

            stack[size++] = c;
        }

        int resultLen = size - K;

        System.out.println(new String(stack, 0, resultLen));
    }
}
