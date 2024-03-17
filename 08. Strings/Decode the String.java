

//   https://www.geeksforgeeks.org/problems/decode-the-string2444/1


class Solution{
    static int i;
    static String decodedString(String s){
        i = 0;

        return getString(s);
    }

    static String getString(String s){
        StringBuilder sb = new StringBuilder();

        while(i < s.length()){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int n = 0;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    n = n * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i++;
                String newStr = getString(s);
                while (n > 0) {
                    sb.append(newStr);
                    n--;
                }
            }else{
                if(s.charAt(i) == ']'){
                    i++;
                    return sb.toString();
                }else{
                    sb.append(s.charAt(i) + "");
                    i++;
                }
            }
        }

        return sb.toString();
    }
}