

//     https://leetcode.com/problems/search-suggestions-system/


import java.util.*;
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        List<List<String>> res = new ArrayList<>();
        Arrays.sort(products);

        int lidx = 0;
        int ridx = products.length - 1;

        for(int i = 0; i < searchWord.length(); i++){
            char ch = searchWord.charAt(i);

            while (lidx <= ridx) {
                if(products[lidx].length() <= i || products[lidx].charAt(i) != ch){
                    lidx++;
                }else{
                    break;
                }
            }

            while (ridx >= lidx) {
                if(products[lidx].length() <= i || products[ridx].charAt(i) != ch){
                    ridx--;
                }else{
                    break;
                }
            }

            int cnt = 1;
            List<String> temp = new ArrayList<>();
            for(int j = lidx; j <= ridx && cnt <= 3; j++){
                temp.add(products[j]);
                cnt++;
            }

            res.add(temp);
        }

        return res;
    }
}