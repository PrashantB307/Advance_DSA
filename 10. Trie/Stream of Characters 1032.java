

//   https://leetcode.com/problems/stream-of-characters/description/

//   https://www.naukri.com/code360/problems/stream-of-characters_1459117


class StreamChecker {

    public class Node{
        Node[] child= new Node[26];
        boolean isEnd = false;
    }

    final Node root;
    final StringBuilder sb;

    public StreamChecker(String[] words) {

        root = new Node();
        sb = new StringBuilder();

        for(String s : words){
            Node curr = root;

            for(int i = s.length() - 1; i >= 0; i--){
                char ch = s.charAt(i);

                if (curr.child[ch - 'a'] == null) {
                    curr.child[ch - 'a'] = new Node();
                }

                curr = curr.child[ch - 'a'];
            }

            curr.isEnd = true;
        }   
    }
    
    public boolean query(char letter) {
        
        sb.append(letter);
        Node curr = root;

        for(int i = sb.length() - 1; i >= 0; i--){
            char ch = sb.charAt(i);

            curr = curr.child[ch -'a'];

            if(curr == null){
                return false;
            }

            if(curr.isEnd){
                return true;
            }
        }

        return false;
    }
}