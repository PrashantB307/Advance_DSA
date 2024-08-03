

//    https://www.naukri.com/code360/problems/pretty-json_1112618


import java.util.* ; 
class Solution {
    public static ArrayList<String> prettyJSON(String str) {
        
        StringBuilder sb = new StringBuilder();
        int sp = 0;

        for(char ch : str.toCharArray()){
            if(ch == '[' || ch == '{'){
                append(sb, sp);
                sp++;
                sb.append(ch);
                append(sb, sp);
            }else if(ch == ']' || ch == '}'){
                sp--;
                append(sb, sp);
                sb.append(ch);
            }else{
                sb.append(ch);
                if(ch == ','){
                    append(sb, sp);
                }
            }
        }

        String[] strArr = sb.toString().trim().split("\n");

        return new ArrayList<>(Arrays.asList(strArr));
    }

    public static void append(StringBuilder sb, int sp){
        if(sb.length() > 0){
            sb.append("\n");
        }

        while (sp > 0) {
            sb.append("    "); // 4 spaces
            sp--;
        }
    }
}