

//    https://www.geeksforgeeks.org/problems/quick-sort/1


class Solution
{
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int lo, int hi)
    {
        int pivot = arr[hi];
        int i = lo - 1;

        for(int j = lo; j <= hi - 1; j++){
            if(arr[j] < pivot){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[hi];
        arr[hi] = temp;

        return i + 1;
    } 
}