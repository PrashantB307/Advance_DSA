

//    https://practice.geeksforgeeks.org/problems/valid-pair-sum--141631/1


import java.util.*;
class Solution 
{ 
    static long ValidPair(int a[], int n) 
	{ 
	    
	    Arrays.sort(a);
	    long cnt = 0;
	    int l = 0;
	    int r = n -1;
	    
        while(l < r){
            if(a[l] + a[r] > 0){
                cnt += r - l;
                r--;
            }else{
                l++;
            }
        }

        return cnt;
	}
} 