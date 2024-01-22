

//   https://www.geeksforgeeks.org/problems/smaller-on-left20360700/1


import java.util.*;
class Complete{
    
    public static int[] Smallestonleft (int arr[], int n) {
        int[] ans = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < n; i++){
            if(set.isEmpty()){
                ans[i] = -1;
            }else{
                if(set.lower(arr[i]) != null){
                    ans[i] = set.lower(arr[i]);
                }else{
                    ans[i] = -1;
                }
            }
            
            set.add(arr[i]);
        }
        
        return ans;
    }
}

