

//    https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1


import java.util.*;
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        int i = 0;
        int j = 0;
        
        while(i < n && j < m){
            if((int)a1[i] < (int)a2[j]){
                i++;
            }else if((int)a1[i] == (int)a2[j]){
                i++;
                j++;
            }else{
                return "No";
            }
        }
        
        return (j == m) ? "Yes" : "No"; 
    }
}