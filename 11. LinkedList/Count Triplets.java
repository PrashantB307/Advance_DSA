

//    https://www.geeksforgeeks.org/problems/count-triplets--141631/1


import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solve
{
    static int countTriplets(Node head, int x) 
    { 
        ArrayList<Integer> list = new ArrayList<>();
        
        Node temp = head;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        
        int n = list.size();
        int cnt = 0;
        
       
        for(int i = 0; i < n - 2; i++){
            int sub = x - list.get(i);
             HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                if(set.contains(sub - list.get(j))){
                    cnt++;
                }
                set.add(list.get(j));
            }
        }
        
        return cnt;
    } 
}