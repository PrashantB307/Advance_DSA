

//    https://www.geeksforgeeks.org/problems/numbers-with-one-absolute-difference2416/1


import java.util.*;
class Solution{
    
    ArrayList<Long> absDifOne(long N){
        ArrayList<Long> list = new ArrayList<>();
        if(N <= 9){
            return list;
        }

        Queue<Long> q = new LinkedList<>();

        for(long i = 1; i <= 9; i++){
            q.add(i);
        }

        while (!q.isEmpty()) {
            
            long num = q.peek();
            q.remove();
            
            if(num > N){
                break;
            }
    
            if(num > 9){
                list.add(num);
            }
    
            long lastDig = num % 10;
            long n1, n2;

            if(lastDig == 0){
                n1 = num * 10 + 1;
                q.add(n1);
            }else if(lastDig == 9){
                n2 = num * 10 + 8;
                q.add(n2);
            }else{
                n1 = num * 10 + lastDig - 1;
                n2 = num * 10 + lastDig + 1;
                q.add(n1);
                q.add(n2);
            }
        }

        Collections.sort(list);
    
        return list;
    }

}