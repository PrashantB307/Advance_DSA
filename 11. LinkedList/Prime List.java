

//    https://www.geeksforgeeks.org/problems/prime-list--170646/1


class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
class Solution
{
    Node primeList(Node head){
        
        Node temp = head;
        
        while(temp != null){
            int val = temp.val;
            
            if(val == 1){
                temp.val = 2;
                temp = temp.next;
                continue;
            }
            
            int left = val;
            int right = val;
            
            while(!isPrime(left)){
                left--;
            }
            
            while(!isPrime(right)){
                right++;
            }
            
            int dist1 = val - left;
            int dist2 = right - val;
            
            if(dist1 > dist2){
                temp.val = right;
            }else{
                temp.val = left;
            }
            
            temp = temp.next;
        }
        
        return head;
        
    }
    
    boolean isPrime(int val){
        if(val < 2){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(val); i++){
            if(val % i == 0){
                return false;
            }
        }
        
        return true;
    }
}