

//   https://leetcode.com/problems/open-the-lock/


import java.util.*;
class Solution {

    Set<String> visited = new HashSet<>();
    public int openLock(String[] deadends, String target) {
        
        if(target == null || target.length() == 0){
            return -1;
        }

        for(String s : deadends){
            visited.add(s);
        }

        Queue<String> q = new LinkedList<>();
        q.add("0000");

        int lev = 0;

        while(q.size() > 0){
            int size = q.size();

            while (size-- > 0) {

                String curr = q.remove();
                if(visited.contains(curr)){
                    continue;
                }

                if(curr.equals(target)){
                    return lev;
                }

                for(String str : nextStates(curr)){
                    if(!visited.contains(str)){
                        q.add(str);
                    }
                }

                visited.add(curr);
            }

            lev++;
        }

        return -1;
    }

    public Set<String> nextStates(String str){

        Set<String> newLocks = new HashSet<>();
        char[] lock = str.toCharArray();

        for(int i = 0; i < 4; i++){
            char ch = lock[i];

            lock[i] = ch == '9' ? '0' : (char)(ch + 1);
            newLocks.add(new String(lock));

            lock[i] = ch == '0' ? '9' : (char)(ch - 1);
            newLocks.add(new String(lock));

            lock[i] = ch;
        }

        return newLocks;
    }
}