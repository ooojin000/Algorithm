import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int cnt = 0;

        for (int k = 0; k < n; k++) {
            int i = 0;
            int j = n - 1;

            while (i < j) {
                if (arr[i] + arr[j] == arr[k]) {
                    if (i != k && j != k) {
                        cnt++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (arr[i] + arr[j] < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }

        }
        System.out.println(cnt);
    }
}
