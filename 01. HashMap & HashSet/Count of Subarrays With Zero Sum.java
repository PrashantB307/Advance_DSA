

//    https://www.codingninjas.com/studio/problems/subarrays-with-zero-sum_3161876?leftPanelTab=0


class Solution {

	public static int countSubarrays(int n, int[] arr) {
		int count = 0;
		int sum = 0;

		for(int i = 0; i < n; i++){
			sum = arr[i];

			if(sum == 0){
				count++;
			}
			for(int j = i + 1; j < n; j++){
				sum += arr[j];
				if(sum == 0){
				    count++;
			    }
			}
		}

		return count;
	}

}
