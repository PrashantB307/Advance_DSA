

//   https://www.geeksforgeeks.org/problems/spiral-matrix--141631/1

//   https://www.geeksforgeeks.org/problems/find-nth-element-of-spiral-matrix/1


class Solution {

    public int findK(int matrix[][], int r, int c, int k) {
        int cnt = 0;

        int minr = 0;
        int minc = 0;
        int maxr = r - 1;
        int maxc = c - 1;

        while (minr <= maxr && minc <= maxc) {

            for (int i = minc; i <= maxc; i++) {
                // ans.add(matrix[minr][i]);
                cnt++;
                if (cnt == k) {
                    return matrix[minr][i];
                }
            }
            minr++;

            for (int i = minr; i <= maxr; i++) {
                // ans.add(matrix[i][maxc]);
                cnt++;
                if (cnt == k) {
                    return matrix[i][maxc];
                }
            }
            maxc--;

            if (minr <= maxr) {
                for (int i = maxc; i >= minc; i--) {
                    // ans.add(matrix[maxr][i]);
                    cnt++;
                    if (cnt == k) {
                        return matrix[maxr][i];
                    }
                }
                maxr--;
            }

            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    // ans.add(matrix[i][minc]);
                    cnt++;
                    if (cnt == k) {
                        return matrix[i][minc];
                    }
                }
                minc++;
            }
        }

        return -1;

    }
}