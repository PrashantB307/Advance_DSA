

//   https://leetcode.com/problems/longest-mountain-in-array/


class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxlen = 0;
		int l = 0;
		int r = 0;

		while(l < n - 1){
			while(l < n - 1 && arr[l] >= arr[l + 1]){
				l++;
			}

			r = l + 1;
			while(r < n - 1 && arr[r] < arr[r + 1]){
				r++;
			}

			while(r < n - 1 && arr[r] > arr[r + 1]){
				r++;

				maxlen = Math.max(maxlen, r - l + 1);
			}

			l = r;
		}

		return maxlen;
    }
}