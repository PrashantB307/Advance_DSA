

//    https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1

//    https://www.codingninjas.com/studio/problems/minimum-swaps-to-bring-all-elements-less-than-or-equal-to-k-together_1112657


class Complete{
    public static int minSwap (int arr[], int n, int k) {
        
        int fav = 0;
        int nonfav = 0;

        for(int val : arr){
            if(val <= k){
                fav++;
            }
        }

        for(int i = 0; i < fav; i++){
            if(arr[i] > k){
                nonfav++;
            }
        }

        int l = 0;
        int r = fav - 1;
        int res = Integer.MAX_VALUE;

        while(r < n){
            res = Math.min(nonfav, res);
            r++;

            if(r < n && arr[r] > k){
                nonfav++;
            }
            if(l < n && arr[l] > k){
                nonfav--;
            }
            l++;
        }

        return res == Integer.MAX_VALUE ? 0 : res; 
    }
}