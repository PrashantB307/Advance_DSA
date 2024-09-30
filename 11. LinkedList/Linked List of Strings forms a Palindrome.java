

//   https://www.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1


class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        next = null;
    }
}

class Solution {
    public boolean compute(Node root) {
        Node temp = root;
        String str = "";
        
        while(temp != null){
            str += temp.data;
            temp = temp.next;
        }

        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}