

//  https://www.geeksforgeeks.org/problems/three-way-partitioning/1

//  https://www.naukri.com/code360/problems/three-way-partition_1170519


class Solution {
    public void threeWayPartition(int arr[], int a, int b) {

        int i = 0;
        int st = 0, end = arr.length - 1;

        while (i <= end) {
            if(arr[i] < a){
                swap(arr, i, st);
                i++;
                st++;
            }else if(arr[i] >= a && arr[i] <= b){
                i++;
            }else if(arr[i] > b){
                swap(arr, i, end);
                end--;
            }
        }

    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

