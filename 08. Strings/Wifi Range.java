

//   https://www.geeksforgeeks.org/problems/wifi-range--170647/1


class Solution 
{ 
    boolean wifiRange(int n, String s, int x) 
    { 
        int cst = 0;
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                cst = -x;
            }else{
                cst++;
            }
            if(cst > x){
                return false;
            }
        }
        
        return cst <= 0;
    }
} 