

//    https://practice.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1


class Solution{
 
    public static int maxConsecutiveOnes(int n) {
        
        String str = Integer.toBinaryString(n);
		int c = 0;
		int max = 0;
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == '1'){
			    c++;
			}else{
			    max = Math.max(max, c);
			    c = 0;
			}
		}
		
		max = Math.max(max, c);
        
		return max;
    }
}