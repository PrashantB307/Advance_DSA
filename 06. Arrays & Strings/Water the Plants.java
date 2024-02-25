

//   https://www.geeksforgeeks.org/problems/water-the-plants--170646/1


import java.util.*;
class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        int[] plants = new int[n];
        Arrays.fill(plants, -1);

        for(int i = 0; i < n; i++){
            if(gallery[i] != -1){
                int a = Math.max(0, i - gallery[i]);
                int b = Math.min(n - 1, i + gallery[i]);

                for(int j = a; j <= b; j++){
                    plants[j] = Math.max(plants[j], b);
                }
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            if(plants[i] == -1){
                return -1;
            }

            if(i <= plants[i]){
                ans++;
                i = plants[i];
            }
        }

        return ans;
    }
}
