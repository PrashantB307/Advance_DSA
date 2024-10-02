

//   https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1


class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
class Solution {
    long mod = 1000000007;
    
    public long multiplyTwoLists(Node first, Node second) {
        long f = getNum(first);
        long s = getNum(second);

        return (f * s) % mod;
    }
    
    public long getNum(Node node){
        long res = 0;
        while(node != null){
            res = ((res * 10) + node.data) % mod;
            node = node.next;
        }
        
        return res;
    }
}