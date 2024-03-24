

//   https://www.geeksforgeeks.org/problems/balance-with-respect-to-an-array5443/1


class Solution {
    public static String isBalanced(int a[], int n, int x) {
        int floor = findFloor(a, x, n);
        int ceil = findCeil(a, x, n);
       
        if (ceil == -1 || floor == -1) {
            return "Balanced";
        }
        if (Math.abs(x - a[ceil]) == Math.abs(x - a[floor])) {
            return "Balanced";
        } else {
            return "Not Balanced";
        }

    }

    public static int findFloor(int[] arr, int x, int n) {
        int floor = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                floor = mid;
                break;
            } else if (arr[mid] < x) {
                floor = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int findCeil(int[] arr, int x, int n) {
        int ceil = -1;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ceil = mid;
                break;
            } else if (arr[mid] > x) {
                ceil = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }
}