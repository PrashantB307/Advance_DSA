

//   https://www.geeksforgeeks.org/problems/number-of-pairs-1587115620/1


import java.util.*;
class Solution {
    static long countPairs(int x[], int y[], int M, int N) {

        long ans = 0;
        int ze = 0;
        int on = 0;
        int two = 0;
        int thr = 0;
        int four = 0;
        for (int i : y) {
            if (i == 0)
                ze++;
            if (i == 1)
                on++;
            if (i == 2)
                two++;
            if (i == 3)
                thr++;
            if (i == 4)
                four++;
        }

        Arrays.sort(y);

        for (int i : x) {
            if (i == 0)
                continue;
            else if (i == 1) {
                ans += ze;
                continue;
            } else if (i == 2) {
                int ind = upperBound(y, i);
                if (ind != -1) {
                    ans += N - ind;
                }
                ans -= thr;
                ans -= four;
                ans += on;
                ans += ze;
            } else {
                int ind = upperBound(y, i);
                if (ind != -1) {
                    ans += N - ind;
                }
                ans += on;
                ans += ze;
                if (i == 3)
                    ans += two;
            }
        }

        return ans;
    }

    static int upperBound(int a[], int x) {
        int s = 0;
        int l = a.length - 1;
        int ans = -1;

        while (s <= l) {
            int mid = (s + l) >> 1;
            if (a[mid] > x) {
                ans = mid;
                l = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return ans;

    }
}