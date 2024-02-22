

//    https://practice.geeksforgeeks.org/problems/equal-sum0810/1


class Solution {
    String equilibrium(int arr[], int n) {
        
        int ls = 0;
        int rs = 0;
        
        for(int i = 0; i < n; i++){
            rs += arr[i];
        }
        
        for(int i = 0; i < n; i++){
            rs -= arr[i];
            
            if(ls == rs){
                return "YES";
            }
            
            ls += arr[i];
        }

        return "NO";
    }
}