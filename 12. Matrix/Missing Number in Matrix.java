

//   https://www.geeksforgeeks.org/problems/missing-number-in-matrix5316/1


class Solution
{
    public long  MissingNo(int[][] matrix)
    {
       int n = matrix.length, k = 0, l = 0;
        long[] row = new long[n];
        long[] col = new long[n];
        long d1 = 0, d2 = 0, temp = 0, ele = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
                if (matrix[i][j] == 0) {
                    k = i;
                    l = j;
                }
                col[j] += matrix[i][j];
            }
            row[i] = sum;
        }

        if (k == 0) {
            temp = row[1];
        } else {
            temp = row[0];
        }

        for (int i = 0; i < n; i++) {
            if (i == k) {
                ele = temp - row[i];
            } else if (row[i] != temp) {
                return -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == l) {
                if (ele + col[i] != temp) {
                    return -1;
                }
            } else if (col[i] != temp) {
                return -1;
            }
        }

        for (int i = 0; i < n; i++) {
            d1 += matrix[i][i];
            d2 += matrix[i][n - 1 - i];
            if (matrix[i][i] == 0) {
                d1 += ele;
            }
            if (matrix[i][n - 1 - i] == 0) {
                d2 += ele;
            }
        }

        if ((d1 != temp) || (d2 != temp) || (ele <= 0)) {
            return -1;
        }

        return ele;
    }
}