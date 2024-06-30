

//    https://www.geeksforgeeks.org/problems/compare-two-fractions4438/1


class Solution {
    String compareFrac(String str) {

        String[] arr = str.split(",");
        String s1 = arr[0];
        String s2 = arr[1];

        s2 = s2.trim();

        String[] str1 = s1.split("/");
        String[] str2 = s2.split("/");

        double val1 = Double.parseDouble(str1[0]) / Double.parseDouble(str1[1]);
        double val2 = Double.parseDouble(str2[0]) / Double.parseDouble(str2[1]);

        if (val1 > val2) {
            return s1;
        } else if (val2 > val1) {
            return s2;
        } else {
            return "equal";
        }
    }
}