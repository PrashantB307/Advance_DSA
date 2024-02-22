

//    https://leetcode.com/problems/count-artifacts-that-can-be-extracted/


class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        boolean[][] uncoverd = new boolean[n][n];

        for(int[] digged : dig){
            uncoverd[digged[0]][digged[1]] = true;
        }

        int cnt = 0;
        for(int[] artifact : artifacts){
            boolean extracted = true;

            for(int i = artifact[0]; i <= artifact[2]; i++){
                for(int j = artifact[1]; j <= artifact[3]; j++){
                    if(!uncoverd[i][j]){
                        extracted = false;
                        break;
                    }
                }
            }

            if(extracted){
                cnt++;
            }
        }

        return cnt;
    }
}