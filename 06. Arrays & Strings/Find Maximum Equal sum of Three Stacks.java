

//    https://www.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1


class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int sum1 = 0;
        for(int val : S1){
            sum1 += val;
        }
        int sum2 = 0;
        for(int val : S2){
            sum2 += val;
        }
        int sum3 = 0;
        for(int val : S3){
            sum3 += val;
        }

        int i = 0, j = 0, k = 0;
        while (true) {
            if(i == N1 || j == N2 || k == N3){
                return 0;
            }

            if(sum1 == sum2 && sum2 == sum3){
                return sum1;
            }

            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= S1[i++];
            }else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= S2[j++]; 
            }else if(sum3 >= sum1 && sum3 >= sum2){
                sum3 -= S3[k++];
            }
        }

    }
}