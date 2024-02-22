

//   https://www.geeksforgeeks.org/problems/equilibrium-index-of-an-array/1

//   https://www.codingninjas.com/studio/problems/equilibrium-index_893014

//   https://leetcode.com/problems/find-pivot-index/description/


class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		int ls = 0;
		int rs = 0;

		for(int i = 0; i < arr.length; i++){
			rs += arr[i];
		}

		for(int i = 0; i < arr.length; i++){
			rs -= arr[i];

			if(ls == rs){
				return i;
			}

			ls += arr[i];
		}

		return -1;
		
	}
}