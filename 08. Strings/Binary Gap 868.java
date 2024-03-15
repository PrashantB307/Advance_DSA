

//    https://leetcode.com/problems/binary-gap/



class Solution {
    public int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
		int j = 0;
		int max = 0;
		for(int i = 1; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch == '1'){
				max = Math.max(max, i - j);
				j = i;
			}
		}

		return max;
    }
}