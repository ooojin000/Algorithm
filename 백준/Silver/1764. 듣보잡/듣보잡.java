import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] nArr = new String[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.next();
        }

        Set<String> mSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            mSet.add(sc.next());
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (mSet.contains(nArr[i])) {
                result.add(nArr[i]);
            }
        }
        
        Collections.sort(result);

        System.out.println(result.size());
        
        for (String s : result) {
            System.out.println(s);
        }
    }
}