

//   https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1


import java.util.*;
class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        int max = -1, sum = 0;
        int maxLen = 0;
        int i = 0, j = 0;
        int st = -1, end = -1;

        for(i = 0; i < n; i++){
            if(a[i] >= 0){
                sum += a[i];

                if(sum > max){
                    max = sum;
                    maxLen = i - j + 1;
                    st = j;
                    end = i;
                }else if(sum == max){
                    if(i - j + 1 > maxLen){
                        st = j;
                        end = i;
                    }
                }
            }else{
                j = i;
                j++;
                sum = 0;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int x = st; x <= end; x++){
            list.add(a[x]);
        }

        return list;
    }
}