

//   https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1


class Solution{
    String rremove(String s) {
        
        while (true) {
            int i = 0;
            int n = s.length();
            StringBuilder temp = new StringBuilder();

            while(i < n){
                int j = i + 1;
                while(j < n && s.charAt(i) == s.charAt(j)){
                    j++;
                }

                if(j == i + 1){
                    temp.append(s.charAt(i));
                }

                i = j;
            }

            if(s.length() == temp.length()){
                break;
            }

            s = temp.toString();
        }

        return s;
    }
}