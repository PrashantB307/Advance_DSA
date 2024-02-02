

//    https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

//    https://leetcode.com/problems/palindrome-linked-list/description/



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
     Node left = null;
    boolean isPalindrome(Node head) 
    {      
        left = head;
        return IsPalindromeHelper(head);

    }   
    
    boolean IsPalindromeHelper(Node right){
        if(right == null){
            return true;
        }
        
        boolean res = IsPalindromeHelper(right.next);
        
        if(res == false){
            return false;
        }else if(left.data != right.data){
            return false;
        }else{
            left = left.next;
            return true;
        }
    }
}
