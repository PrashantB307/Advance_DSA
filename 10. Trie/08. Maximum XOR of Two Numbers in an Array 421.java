

//   https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/description/
 
//   https://practice.geeksforgeeks.org/problems/maximum-xor-of-two-numbers-in-an-array/1

//   https://www.codingninjas.com/studio/problems/maximum-xor_3119012


class Solution {

    class Node{
        Node[] children = new Node[2];
    }

    public int findMaximumXOR(int[] nums) {
        
        Node root = new Node();
        
        for(int num : nums){
            Node temp = root;

            for(int i = 30; i >= 0; i--){
                int bit = (num & (1 << i)) == 0 ? 0 : 1;

                if(temp.children[bit] == null){
                    temp.children[bit] = new Node(); 
                }

                temp = temp.children[bit];
            }
        }

        int res = 0;

        for(int num : nums){
            int max_xor = 0;
            Node temp = root;
            
            for(int i = 30; i >= 0; i--){
                int bit = (num & (1 << i)) == 0 ? 0 : 1;
                int cbit = Math.abs(bit - 1);

                if(temp.children[cbit] != null){
                    temp = temp.children[cbit];
                    max_xor = max_xor | (1 << i);
                }else{
                    temp = temp.children[bit];
                }
            }

            res = Math.max(max_xor, res);
        }

        return res;
    }
}