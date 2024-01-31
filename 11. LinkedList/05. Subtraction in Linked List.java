

//    https://practice.geeksforgeeks.org/problems/subtraction-in-linked-list/1


class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Solution
{
    static int getSize(Node n){
        int sz = 0;
        while (n != null) {
            n = n.next;
            sz++;
        }

        return sz;
    }

    static Node padWithZeros(Node node, int pad){

        for(int i = 1; i <= pad; i++){
            Node temp = new Node(0);
            temp.next = node;
            node = temp;
        }

        return node;
    }

    static Node stripLeadingZeros(Node node){

        while (node != null) {
            if(node.data == 0){
                node = node.next;
            }else{
                break;
            }
        }

        if(node == null){
            return new Node(0); 
        }

        return node;
    }

    static Node subLinkedList(Node l1, Node l2){
       
        l1 = stripLeadingZeros(l1);
        l2 = stripLeadingZeros(l2);

        int sz1 = getSize(l1);
        int sz2 = getSize(l2);

        Node small = l1;
        Node large = l2;

        if(sz1 < sz2){
            small = l1;
            large = l2;
            small = padWithZeros(small, sz2 - sz1);
        }else if(sz2 < sz1){
            small = l2;
            large = l1;
            small = padWithZeros(small, sz1 - sz2);
        }else{
            Node t1 = l1;
            Node t2 = l2;
            
            while (t1 != null) {
                if(t1.data < t2.data){
                    small = l1;
                    large = l2;
                    break;
                }else if(t2.data < t1.data){
                    small = l2;
                    large = l1;
                    break;
                }else{
                    t1 = t1.next;
                    t2 = t2.next; 
                }
            }
        }

        Node res = helper(small, large);
        res = stripLeadingZeros(res);
        
        return res;
    }

    static boolean borrow = false;

    static Node helper(Node small, Node large){

        if(small == null){
            return null;
        }

        Node res = helper(small.next, large.next);
        int data = large.data;
        if(borrow){
            data -= 1;
        }

        if(data < small.data){
            borrow = true;
            data += 10;
        }else{
            borrow = false;
        }

        data = data - small.data;

        Node node = new Node(data);
        node.next = res;
        
        return node;
    } 
}