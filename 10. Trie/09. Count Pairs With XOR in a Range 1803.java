

//   https://leetcode.com/problems/count-pairs-with-xor-in-a-range/description/



class Solution {
    class Node {
        Node[] children = new Node[2];
        int count = 0;
    }
    
    void insert(int num){
        Node temp = root;
        for(int i = 15; i >= 0; i--){
            int bit = (num & (1 << i)) == 0? 0: 1;
            if(temp.children[bit] == null){
                temp.children[bit] = new Node();
            }
            temp = temp.children[bit];
            temp.count++;
        }
    }
    
    // counts the numbers x for which num xor x is less than k
    int helper(int a, int k){
        int countSmaller = 0;
        
        Node temp = root;
        for(int i = 15; i >= 0; i--){
            int kbit = (k & (1 << i)) == 0? 0: 1;
            int bit = (a & (1 << i)) == 0? 0: 1;
            int rbit = Math.abs(bit - 1);
            
            if(kbit == 1){
                if(temp.children[bit] != null){
                    countSmaller += temp.children[bit].count;
                }
                
                temp = temp.children[rbit];
            } else {
                temp = temp.children[bit];
            }
            
            if(temp == null){
                break;
            }
        }  
        
        return countSmaller;
    }
    
    Node root = new Node();
    public int countPairs(int[] nums, int low, int high) {
        int res = 0;
        
        for(int num: nums){
            res += helper(num, high + 1) - helper(num, low);
            insert(num);
        }
        
        return res;
    }
}