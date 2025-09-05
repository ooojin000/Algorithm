import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();

        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'M') {
                cnt++;
            } else if (c == 'K') {
                if (cnt > 0) {
                    max.append('5');
                    for (int j = 0; j < cnt; j++) {
                        max.append('0');
                    }
                } else {
                    max.append('5');
                }

                if (cnt > 0) {
                    min.append('1');

                    for (int j = 0; j < cnt - 1; j++) {
                        min.append('0');
                    }

                    min.append('5');
                } else {
                    min.append('5');
                }

                cnt = 0;
            }
        }

        if (cnt > 0) {
            for (int i = 0; i < cnt; i++) {
                max.append('1');
            }
            min.append('1');
            for (int i = 0; i < cnt - 1; i++) {
                min.append('0');
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}