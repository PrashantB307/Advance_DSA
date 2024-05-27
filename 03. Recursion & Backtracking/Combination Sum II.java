

//   https://www.geeksforgeeks.org/problems/combination-sum-ii-1664263832/1


import java.util.*;
class Solution {
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        helper(arr, n, k, 0, 0, list, set);

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l : set){
            ans.add(l);
        }

        Collections.sort(ans, new Comparator<List<Integer>>() {    
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int i=0,j=0,a=o1.size(),b=o2.size();
                while(i<a && j<b){
                    if(o1.get(i)!=o2.get(j))return o1.get(i).compareTo(o2.get(j));
                    i++;
                    j++;
                }
                if(i<a)return -1;
                return 1;
                
            }               
        });

        return ans;
    }

    public void helper(int[] arr, int n, int k, int i, int sum, List<Integer> list, Set<List<Integer>> set){
        if(sum == k){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            set.add(temp);
            return;
        }

        if(i == n){
            return;
        }

        helper(arr, n, k, i + 1, sum, list, set);

        if(sum + arr[i] <= k){
            list.add(arr[i]);
            helper(arr, n, k, i + 1, sum + arr[i], list, set);
            list.remove(list.size() - 1);
        }
    }
}
