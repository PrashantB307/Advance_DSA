

//   https://leetcode.com/problems/concatenated-words/description/

//   https://www.codingninjas.com/studio/problems/ninja-and-the-words_3189109?leftPanelTab=1


import java.util.*;
class Solution {

    class Trie{
    Trie[] a;
    boolean stop;

    public Trie(){
        a=new Trie[26];
        stop=false;
    } 
}

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        ArrayList<String> list= new ArrayList<String>();
        Trie trie = new Trie();
        for(String x:words){
            insert(x,trie);
        }
        for(String x:words){
            if(solve(x,trie,0,1,new Boolean[x.length()],0))
                list.add(x);
        }
        return list;
    }


    private boolean solve(String s,Trie trie,int i,int j,Boolean[] memo,int c){
        if(i==s.length()){
            return c>1; // more than 1 string
        }
        if(memo[i]!=null){
            return memo[i];
        }
        Trie dict = trie;
        for(int k=i;k<s.length();k++){
            dict = dict.a[s.charAt(k)-'a'];
            if(dict==null){
                return memo[i] = false;
            }
            if(dict.stop){
                if(solve(s,trie,k+1,k+2,memo,c+1))
                   return true;
            }
        }
        return memo[i] = false;
    } 
    
    private void insert(String s,Trie trie){
        for(char ch:s.toCharArray()){
            if(trie.a[ch-'a']==null) {
                trie.a[ch-'a'] = new Trie();
            }
            trie=trie.a[ch-'a'];
        }
        trie.stop=true;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



class Solution2 {

    class Node {
        boolean eow;
        Node[] arr = new Node[26];
    }

    Node root = new Node();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        for(String word : words){
            Node temp = root;
            for(char ch : word.toCharArray()){
                if(temp.arr[ch - 'a'] == null){
                    temp.arr[ch - 'a'] = new Node();
                }
                
                temp = temp.arr[ch - 'a'];
            }

            temp.eow = true;
        }

        List<String> res = new ArrayList<>();

        for(String word : words){
            flag = false;
            wordBreak(word, 0);
            if(flag == true){
                res.add(word);
            }
        }

        return res;
    }

    boolean flag = false;
    void wordBreak(String word, int rsf){

        if(word.length() == 0){
            if(rsf >= 2){
               flag = true;
            }
            return;
        }

        Node temp = root;

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(temp.arr[ch - 'a'] != null){
                temp = temp.arr[ch - 'a'];
                if(temp.eow == true){
                    wordBreak(word.substring(i + 1), rsf + 1);
                }
            }else{
                return;
            }
        }
    }
}