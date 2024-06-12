

//    https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1


class GFG
{
    static void rotate(int matrix[][]) 
    {
        int n = matrix.length;
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int top = 0;
        int bottom = n - 1;

        while (top < bottom) {
            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
            top++;
            bottom--;
        }
    }
}