

//   https://leetcode.com/problems/add-binary/description/

//   https://practice.geeksforgeeks.org/problems/add-binary-strings3805/1


class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int carry = 0;

        while(i >= 0 || j >= 0){
            sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXX=====>   GFG    <=====XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX   


class Solution2 {
    String addBinary(String a, String b) {
        
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        boolean flag=false;
        while(i>=0 || j>=0 ){
            int p=i>=0?a.charAt(i)-'0':0;
            int q=j>=0?b.charAt(j)-'0':0;
            
            if(!flag && (p==1 || q==1)){
                flag=true;                
            }
            
            if(p+q+carry>2){
                carry=1;
                sb.append("1");
            }else if(p+q+carry>1){
                carry=1;
                sb.append("0");
            }
            else{
                sb.append(p+q+carry+"");
                carry=0;
            }
            
            i--;
            j--;
        }
        if(flag==false){
            return "0";
        }
        String s=sb.reverse().toString();
        if(carry!=0){
            s="1"+s;
        }else if(s.charAt(0)=='0'){
            int k=0;
            for(k=0;k<s.length();k++){
                char c=s.charAt(k);
                if(c=='0'){
                    continue;
                }else{
                    break;
                }
            }
            s=s.substring(k,s.length());
        }
        
        return s;
    }
}