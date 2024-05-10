

//   https://www.geeksforgeeks.org/problems/count-the-elements1529/1


import java.util.*;
class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : query){
            int val = a[i];

            int cnt = 0;
            for(int j : b){
                if(j <= val){
                    cnt++;
                }
            }

            list.add(cnt);
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for(int val : list){
            ans[i++] = val;
        }

        return ans;
    }
}
