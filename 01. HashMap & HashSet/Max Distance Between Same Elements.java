

//    https://practice.geeksforgeeks.org/problems/max-distance-between-same-elements/1

//    https://www.codingninjas.com/studio/problems/maximum-distance_758901



import java.util.*;
class Solution
{
    int maxDistance(int arr[], int n)
    {
	     HashMap<Integer, Integer> map = new HashMap<>();
	     
	     for(int i = 0; i < n; i++){
	         if(!map.containsKey(arr[i])){
	             map.put(arr[i], i);
	         }
	     }
	     
	     int maxDist = 0;
	     for(int i = n - 1; i >= 0; i--){
	         maxDist = Math.max(maxDist, i - map.get(arr[i]));
	     }
	     
	     return maxDist;
    }
}