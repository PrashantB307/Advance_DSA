

//    https://www.geeksforgeeks.org/problems/number-of-subarrays-with-maximum-values-in-given-range5949/1


class Solution{
    
    static long countSubarrays(int a[], int n, int L, int R)  
    { 
        int s = -1;
        int e = -1;
        long res = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] >= L && a[i] <= R){
                e = i;
            }else if(a[i] > R){
                e = s = i ;
            }else{
                //  Nothimg
            }

            res += (e - s);
        }

        return res;
    } 
}