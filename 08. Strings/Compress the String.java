

//    https://www.codingninjas.com/studio/problems/compress-the-string_893402


class Solution {
	public static String compressTheString(String s) {
		String str = "";
        int c = 1;

        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                c++;
            }else{
                str += s.charAt(i);
                if(c > 1){
                    str += c;
                    c = 1;
                }
            }
        }

        str += s.charAt(s.length() - 1);
        if(c > 1){
            str += c;
        }
        
        return str;
	}

}