

//   https://www.geeksforgeeks.org/problems/check-if-a-number-is-divisible-by-83957/1


class Solution{
    int DivisibleByEight(String s){
        if(s.length() < 3){
            int n = Integer.parseInt(s);
            if(n % 8 == 0){
                return 1;
            }
        }
        
        int n = s.length();
        String str = "";
        for(int i = n - 3; i < s.length(); i++){
            str += s.charAt(i);
        }
        
        int num = Integer.parseInt(str);
        if(num % 8 == 0){
            return 1; 
        }
        
        
        return -1;
    }
}