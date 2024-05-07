

//    https://www.geeksforgeeks.org/problems/shortest-path-in-a-binary-maze-1655453161/1


import java.util.*;
class pair {
    int first, second, third;

    pair(int a, int b, int c) {
        first = a;
        second = b;
        third = c;
    }
}

class Solution {

    int shortestPath(int[][] A, int[] source, int[] dest) {
        if (source[0] == dest[0] && dest[1] == source[1]) {
            return 0;
        }

        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, source[0], source[1]));
        int dx[] = { 1, -1, 0, 0 };
        int dy[] = { 0, 0, 1, -1 };

        while (q.size() != 0) {
            pair temp = q.remove();
            int dis = temp.first;
            int i = temp.second;
            int j = temp.third;

            if (i == dest[0] && j == dest[1])
                return dis;

            for (int k = 0; k < 4; k++) {
                int newi = i + dx[k];
                int newj = j + dy[k];

                if (newi >= 0 && newj >= 0 && newi < A.length && newj < A[0].length && A[newi][newj] == 1) {
                    A[newi][newj] = 2;

                    q.add(new pair(dis + 1, newi, newj));
                }
            }
        }

        return -1;
    }
};