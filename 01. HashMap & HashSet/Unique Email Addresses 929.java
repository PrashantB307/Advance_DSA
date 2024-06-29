

//   https://leetcode.com/problems/unique-email-addresses/


import java.util.*;
class Solution {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        int cnt = 0;

        for(String email : emails){
            int plusIdx = email.indexOf("+");
            int atIdx = email.indexOf("@");

            String str = "";

            if(plusIdx >= 0){
                str = email.substring(0, plusIdx);
            }else{
                str = email.substring(0, atIdx);
            }

            str = str.replace(".", "") + email.substring(atIdx);

            if(!set.contains(str)){
                set.add(str);
                cnt++;
            }
        }

        return cnt;
    }
}

