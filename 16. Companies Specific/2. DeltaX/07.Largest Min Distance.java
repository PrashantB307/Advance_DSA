// INPUT The first line of input contains positive integers N and K separated by a
//  space. The next lines contain N numbers of positive integers, A[i], which 
// denotes the room number available to be used.

// OUTPUT Print the largest minimum distance that can be maintained between the rooms.

// CONSTRAINTS 2 <= N <= 10^5 
//             2 <= K <= N 
//             1 <= A[i] <= 10^9

// Example I/P --> 5 3 
//                 1 2 4 8 9

// Example O/P --> 3

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int dist = findMinDist(arr, n, k);

        System.out.println(dist);
    }

    public static int findMinDist(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int low = 1;
        int high = arr[n - 1] - arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(arr, n, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static boolean canPlace(int[] arr, int n, int k, int mid) {
        int cnt = 1;
        int prev = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - prev >= mid) {
                cnt++;
                prev = arr[i];
            }
        }

        return cnt >= k;
    }
}