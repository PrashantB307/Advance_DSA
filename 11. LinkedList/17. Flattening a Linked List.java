

//    https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1

//    https://www.codingninjas.com/studio/problems/flatten-a-linked-list_1112655


class Node{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}

class GfG
{
    Node flatten(Node root){

        if(root == null || root.next == null){
            return root;
        }

        return mergeList(root, flatten(root.next));
    }

    Node mergeList(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        Node ans = null;
        if(l1.data < l2.data){
            ans = l1;
            ans.bottom = mergeList(l1.bottom, l2);
        } else{
            ans = l2;
            ans.bottom = mergeList(l1, l2.bottom);
        }

        ans.next = null;
        return ans;
    }
}