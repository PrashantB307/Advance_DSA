

//   https://practice.geeksforgeeks.org/problems/ticket-counter-2731/1


import java.util.*;
class Solution {
    public static int distributeTicket(int N,int K)
    {
        
        if(N == K){
            return K;
        }
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            dq.add(i);
        }
        
        int flag = 0;
        
        while(dq.size() > K){
            int k = K;
            flag = 0;
            
            while(dq.size() > k && k != 0){
                dq.removeFirst();
                k--;
            }
            
            k = K;
            while(dq.size() > k && k != 0){
                dq.removeLast();
                k--;
                flag = 1;
            }
           
        }
        
        if(flag == 1){
            return dq.removeLast();
        }
    
        return dq.removeFirst();
        
    }
}