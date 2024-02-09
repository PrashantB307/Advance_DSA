

//   https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

//   https://www.codingninjas.com/studio/problems/count-distinct-element-in-every-k-size-window_920336?leftPanelTab=1

//   https://www.interviewbit.com/problems/distinct-numbers-in-window/



import java.util.*;
class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> res = new  ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < k; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        
        res.add(map.size());
        
        int j = 0;
        for(int i = k; i < n; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            
            if(map.get(A[j]) == 1){
                map.remove(A[j]);
            }else{
                map.put(A[j], map.getOrDefault(A[j], 0) - 1);
            }
            j++;
            res.add(map.size());
        }
        
        return res;
        
    }
}