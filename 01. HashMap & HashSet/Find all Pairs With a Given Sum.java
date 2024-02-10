

//   https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1


import java.util.*;
class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public pair[] allPairs(long A[], long B[], long N, long M, long tar) {
        
        HashSet<Long> set = new HashSet<>();
        ArrayList<pair> list = new ArrayList<>();

        for (Long val : B) {
            set.add(val);
        }

        Arrays.sort(A);

        for (long x : A) {
            long val = tar - x;
            if(set.contains(val)){
                pair p = new pair(x, val);
                list.add(p);
            }
        }

        pair[] ans = new pair[list.size()];
        int k = 0;
        for(pair p : list){
            ans[k++] = p;
        }

        return ans;
    }
}