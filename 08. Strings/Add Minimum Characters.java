

//   https://practice.geeksforgeeks.org/problems/add-minimum-characters--170648/1

//   https://www.codingninjas.com/studio/problems/minimum-characters-for-palindrome_893000


class Solution
{
	public static int addMinChar(String str){
		int n = str.length();
        int cnt = 0;
        int l = 0;
        int r = n - 1;
        
        while(l < r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }else{
                cnt++;
                l = 0;
                r = n - cnt - 1;
            }
        }

        return cnt;
	}
}