//Min Function Value
// Given an array A of N positive integers and an integer M, your task is to pick M integers from A into an array B such that the function F given below gives the least possible value:
// F(B) = Max(B) − Min(B)

// Print the lowest possible value of the given function F.

// Sample input
// 8 5
// 3 4 3 8 1 15 20 3

// Sample output
// 3


import java.util.*;
class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - m + 1; i++) {
            int curr = arr[i + m - 1] - arr[i];
            min = Math.min(min, curr);
        }

        System.out.println(min);

        sc.close();

    }
}