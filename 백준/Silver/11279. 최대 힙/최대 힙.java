import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 우선순위가 높은 숫자가 먼저 나옴 (큰 숫자) - 우선순위 큐
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                if (pQ.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pQ.poll());
                }
            } else {
                pQ.add(x);
            }
        }

    }
}
