

//    https://www.geeksforgeeks.org/problems/remove-b-and-ac-from-a-given-string4336/1


class Solution {
    public String stringFilter(String str) {

        str = str.replace("ac", "");
        str = str.replace("b", "");
        
        return str;
    }
}