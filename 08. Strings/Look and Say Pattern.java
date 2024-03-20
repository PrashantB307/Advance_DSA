

//   https://www.geeksforgeeks.org/problems/decode-the-pattern1138/1


class Solution{
    static String lookandsay(int n) {
        if(n == 1){
            return "1";
        }else if(n == 2){
            return "11";
        }

        String res = lookandsay(n - 1);

        String nres = "";
        int cnt = 1;

        for(int i = 1; i < res.length(); i++){
            if(res.charAt(i) != res.charAt(i - 1)){
                nres += cnt;
                nres += res.charAt(i - 1);
                cnt = 1;
            }else{
                cnt++;
            }

            if(i == res.length() - 1){
                nres += cnt;
                nres += res.charAt(i);
            }
        }

        return nres;
    }
}
