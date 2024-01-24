

//    https://leetcode.com/problems/design-add-and-search-words-data-structure/description/



class WordDictionary {

    class Node {
        boolean eow = false;    // eow = End of Word
        Node[] child = new Node[26];
    }
    Node root;

    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
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
        
        return helper(word, 0, root);
    }

    boolean helper(String word, int i, Node node){
        if(i == word.length()){
            return node.eow;
        }

        char ch = word.charAt(i);
        if(ch != '.'){
            Node children = node.child[ch - 'a'];
            if(children != null){
                return helper(word, i + 1, children);
            }else{
                return false;
            }
        }else{
            for(char nch = 'a'; nch <= 'z'; nch++){
                Node children = node.child[nch - 'a'];
                if(children != null){
                    boolean found = helper(word, i + 1, children);
                    if(found){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
 