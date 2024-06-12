

//    https://www.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1


import java.util.*;
class Solution
{
    public int[] reverseSpiral(int r, int c, int[][] matrix)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        int minr = 0;
        int minc = 0;
        int maxr = r - 1;
        int maxc = c - 1;
        
        while(minr <= maxr && minc <= maxc){
            
            for(int i = minc; i <= maxc; i++){
				ans.add(matrix[minr][i]);
            }
			minr++;

			for(int i = minr; i <= maxr; i++){
			    ans.add(matrix[i][maxc]);
			}
			maxc--;

			if(minr <= maxr){
			    for(int i = maxc; i >= minc; i--){
			        ans.add(matrix[maxr][i]);
			    }
			    maxr--;
			}

			if(minc <= maxc){
			    for(int i = maxr; i >= minr; i--){
			        ans.add(matrix[i][minc]);
			    }
			    minc++;
			}	
        }
        
        int[] res = new int[ans.size()];
        int k = 0;
        for(int i = ans.size() - 1; i >= 0; i--){
            res[k++] = ans.get(i);
        }
        
        return res;
        
    }
}