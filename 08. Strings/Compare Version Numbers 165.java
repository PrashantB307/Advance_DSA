

//   https://leetcode.com/problems/compare-version-numbers/

//   https://www.naukri.com/code360/problems/compare-versions_1062582


class Solution {
    public int compareVersion(String ver1, String ver2) {
        
        String[] v1 = ver1.split("\\.");
        String[] v2 = ver2.split("\\.");

        int len = Math.max(v1.length, v2.length);

        for(int i = 0; i < len; i++){
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if(num1 < num2){
                return -1;
            }
            if(num1 > num2){
                return 1;
            }
        }

        return 0;
    }
}