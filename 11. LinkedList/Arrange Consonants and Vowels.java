

//    https://www.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1


class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
class Solution {
    
    public Node arrangeCV(Node head){
        Node vowel = new Node('0');
        Node cons = new Node('0');
        Node v = vowel;
        Node c = cons;

        Node temp = head;

        while (temp != null) {
            if(temp.data == 'a' || temp.data == 'e' || temp.data == 'i' || temp.data == 'o' || temp.data == 'u'){
                v.next = temp;
                v = v.next;
            }else{
                c.next = temp;
                c = c.next;
            }

            temp = temp.next;
        }

        v.next = cons.next;
        c.next = null;

        return vowel.next;
    }
}