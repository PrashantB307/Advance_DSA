

//    https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1

//    https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401


import java.util.*;
class Pair {
    int floor, ceil;

    Pair() {
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }
}

class Solve {
    Pair getFloorAndCeil(int[] a, int n, int x) {
        int floor = -1, celling = -1, low = 0, high = n - 1;
        Arrays.sort(a);

        while (low <= high) {

            int mid = (low + high) / 2;

            if (a[mid] == x) {
                floor = a[mid];
                celling = a[mid];
                break;
            }else if (a[mid] > x) {
                celling = a[mid];
                high = mid - 1;
            }else {
                floor = a[mid];
                low = mid + 1;
            }
        }

        return new Pair(floor, celling);
    }
}