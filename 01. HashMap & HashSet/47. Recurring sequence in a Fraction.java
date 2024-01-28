

//  https://practice.geeksforgeeks.org/problems/a-simple-fraction0921/1


import java.util.*;
class Main47 {

    public static String solution(int num, int den) {

        StringBuilder ans = new StringBuilder();

        int q = num / den;
        int r = num % den;
        ans.append(q);

        if(r == 0){
            return ans.toString();
        }else{
            ans.append(".");
            HashMap<Integer, Integer> map = new HashMap<>();
            while(r != 0){
                if(map.containsKey(r)){
                    int len = map.get(r);
                    ans.insert(len, "(");
                    ans.append(")");
                    break;
                }else{
                    map.put(r, ans.length());
                    r *= 10;
                    q = r / den;
                    r = r % den;
                    ans.append(q);
                }
            }
        }

        return ans.toString();
    }
}
 