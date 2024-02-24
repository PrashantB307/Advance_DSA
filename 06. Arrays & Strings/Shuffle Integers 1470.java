

//   https://www.geeksforgeeks.org/problems/shuffle-integers2401/1

//   https://leetcode.com/problems/shuffle-the-array/description/


class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        int i = n / 2 - 1;
        int j = n - 1;

        solver(arr, i, j, n);
    }

    void solver(long[] arr, int i, int j, int n){
        if(n <= 0){
            return;
        }

        long a = arr[i];
        long b = arr[j];

        solver(arr, i - 1, j - 1, n - 2);

        arr[n - 2] = a;
        arr[n - 1] = b;
    }
}