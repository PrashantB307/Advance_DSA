

//   https://leetcode.com/problems/largest-values-from-labels/


import java.util.*;
class Solution {

    class Pair{
        int val, lab;
        Pair(int val, int lab){
            this.val = val;
            this.lab = lab;
        } 
    }

    public int largestValsFromLabels(int[] values, int[] labels, int numWanted, int useLimit) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Pair> list = new ArrayList<>();
        
        for(int i = 0; i < values.length; i++){
            list.add(new Pair(values[i], labels[i]));
        }

        Collections.sort(list, (a, b) -> (b.val - a.val));
        int ans = 0;

        for(int i = 0; i < list.size(); i++){
            Pair curr = list.get(i);
            int val = curr.val;
            int lab = curr.lab;

            if(numWanted > 0){
                if(!map.containsKey(lab)){
                    ans += val;
                    map.put(lab, 1);
                    numWanted--;
                }else{
                    if(map.get(lab) < useLimit){
                        ans += val;
                        map.put(lab, map.get(lab) + 1);
                        numWanted--;
                    }
                }
            }
        }

        return ans;
    }
}