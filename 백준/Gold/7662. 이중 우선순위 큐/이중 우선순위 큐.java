import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();

            int k = Integer.parseInt(br.readLine());

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (command.equals("I")) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (command.equals("D")) {
                    if (!map.isEmpty()) {
                        int count = 0;
                        if (num == 1) {
                            count = map.lastKey();
                        } else if (num == -1) {
                            count = map.firstKey();
                        }
                        map.put(count, map.get(count) - 1);
                        if (map.get(count) == 0) {
                            map.remove(count);
                        }
                    }
                }
            }
            if (map.isEmpty()) {
                sb.append("EMPTY\n");
            } else {
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
