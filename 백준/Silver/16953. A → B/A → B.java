import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long cnt = 1;

        while (b > a) {
            if (b % 10 == 1) {
                b /= 10;
                cnt++;
            } else if (b % 2 == 0) {
                b /= 2;
                cnt++;
            } else {
                break;
            }
        }

        System.out.print(b == a ? cnt : -1);
    }
}