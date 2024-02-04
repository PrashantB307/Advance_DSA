

//   https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1

//   https://www.codingninjas.com/studio/problems/sort-linked-list-of-0s-1s-2s_1071937


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class Solution
{
    static Node segregate(Node head)
    {
        int[] cnt = new int[3];

        for(Node curr = head; curr != null; curr = curr.next){
            if(curr.data == 0){
                cnt[0]++;
            }else if(curr.data == 1){
                cnt[1]++;
            }else{
                cnt[2]++;
            }
        }

        Node curr = head;
        int idx = 0;
        
        while (curr != null) {
            if(cnt[idx] == 0){
                idx++;
            }

            if(cnt[idx] != 0){
                curr.data = idx;
                cnt[idx]--;
                curr = curr.next;
            }
        } 

        return head;
    }
}
