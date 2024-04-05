

class Tree {
    int val;
    Tree left;
    Tree right;
}

class Solution {
    class Pair {
        int op = 0; // length of longest odd (sum of elements is odd) path starting on this node
        int ep = 0;
    }

    int mep = 0;
    public int solve(Tree root) {
        mep = 0;
        helper(root);
        return mep;
    }

    public Pair helper(Tree node){
        if(node == null){
            return new Pair();
        }

        Pair lp = helper(node.left);
        Pair rp = helper(node.right);
        Pair mp = new Pair();

        int lep = Math.max(lp.ep, rp.ep);    // lep = Longest Even Path
        int lop = Math.max(lp.op, rp.op);    // lop = Longest Odd Path

        if(node.val % 2 == 0){
            mp.ep = lep + 1;
            if(lop > 0){
                mp.op = lop + 1;
            }

            int f1 = lp.ep + rp.ep;
            int f2 = lp.op + rp.op;
            int f3 = Math.max(f1, f2);
            mep = Math.max(mep, f3 + 1);
        } else {
            if(lop > 0){
                mp.ep = lop + 1;
            }

            mp.op = lep + 1;

            int f1 = lp.ep + rp.op;
            int f2 = lp.op + rp.ep;
            int f3 = Math.max(f1, f2);
            if(f3 > 0){
                mep = Math.max(mep, f3 + 1);
            }
        }
        
        return mp;
    }
}