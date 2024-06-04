

//   https://www.geeksforgeeks.org/problems/extract-the-number-from-the-string3428/1


class Solution{
    long ExtractNumber(String S){
       
        String[] arr = S.split(" ");
        long max = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].charAt(0) >= '0' && arr[i].charAt(0) <= '9' ){
                if(!arr[i].contains("9")){
                    long num = Long.parseLong(arr[i]);
                    max = Math.max(max, num);
                }
            }
        }

        return max;
    }
}