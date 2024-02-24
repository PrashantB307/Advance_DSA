

//    https://www.geeksforgeeks.org/problems/sequence-of-sequence1155/1


class Solution{
    static int numberSequence(int m, int n)
    {
       return helper(1, 0, m, n);
    }

    static int helper(int i, int j, int m, int n){
        if(j == n){
            return 1;
        }

        if(i > m){
            return 0;
        }

        int pic = helper(i * 2, j + 1, m, n);
        int notPic = helper(i + 1, j, m, n);

        return pic + notPic;
    }
}