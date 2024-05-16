

//   https://www.geeksforgeeks.org/problems/binary-string-1587115620/1


class Solution{
    public static int binarySubstring(int a, String str){
        int ans = 0;
        int cnt  = 0;

        for(char ch : str.toCharArray()){
            if(ch == '1'){
                ans += cnt;
                cnt++;
            }
        }

        return ans;
    }
}