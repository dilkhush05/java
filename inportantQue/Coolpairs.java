import java.util.*;

public class Coolpairs {
    public static int countCoolPairs(int[] arr, int X) {
        int n = arr.length;
        int count = 0;

        // Step 1: Filter elements that have all bits of X
        List<Integer> filtered = new ArrayList<>();
        for (int num : arr) {
            if ((num & X) == X) {
                filtered.add(num);
            }
        }

        // Step 2: Check pairs
        for (int i = 0; i < filtered.size(); i++) {
            for (int j = i + 1; j < filtered.size(); j++) {
                if ((filtered.get(i) & filtered.get(j)) == X) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countCoolPairs(arr, X));
    }
}

5, 1, 5, 7, 3