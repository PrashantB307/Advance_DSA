
import java.util.*;
class Solution{

    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            fill(L[i], R[i], map);
        }

        int num = 0;
        for(int val : map.keySet()){
            if(val > num){
                num = val;
            }
        }

        return num;
    }

    static void fill(int i, int j, HashMap<Integer, Integer> map){
        for(int ii = i; ii <= j; ii++){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
    }
    
}