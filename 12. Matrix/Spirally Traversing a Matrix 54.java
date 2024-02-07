

//     https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

//     https://leetcode.com/problems/spiral-matrix/


import java.util.*;
class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
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
        
        return ans;
        
    }
}
