

//  https://practice.geeksforgeeks.org/problems/sum-of-bit-differences2937/1


class Main89 {

  public static long solution(int[] arr){
   
    int n  = arr.length;
    long ans = 0;
    for(int i = 0; i < 32; i++){
        long count = 0;
        for(int j = 0; j < n; j++){
            if((arr[j] & (1 << i)) == 0){
                count++;
            }
        }
        ans += (count * (n - count) * 2);
    } 
    return ans;
  }
}