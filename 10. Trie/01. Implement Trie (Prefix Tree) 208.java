

//   https://leetcode.com/problems/implement-trie-prefix-tree/

//   https://practice.geeksforgeeks.org/problems/trie-insert-and-search0651/1

//   https://www.codingninjas.com/studio/problems/implement-trie_631356


class Trie {

    class Node {
        boolean eow = false;    // eow = End of Word
        Node[] child = new Node[26];
    }

    Node root;
    public Trie() {
        
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root;
        for(char ch : word.toCharArray()){
            if(node.child[ch - 'a'] == null){
                node.child[ch - 'a'] = new Node();
            }

            node = node.child[ch - 'a'];
        }

        node.eow = true;
    }
    
    public boolean search(String word) {
        Node node = root;
        for(char ch : word.toCharArray()){
            if(node.child[ch - 'a'] == null){
                return false;
            }

            node = node.child[ch - 'a'];
        }

        return node.eow;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        for(char ch : prefix.toCharArray()){
            if(node.child[ch - 'a'] == null){
                return false;
            }

            node = node.child[ch - 'a'];
        }

        return true;
    }
}
