

//    https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1


class Solution{
    public void zigZag(int arr[], int n){
        
        for(int i = 0; i < n - 1; i++){
            if(i % 2 == 0){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }else{
                if(arr[i] < arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}