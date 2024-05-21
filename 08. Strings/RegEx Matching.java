

//    https://www.geeksforgeeks.org/problems/-regex-matching1145/1


class Solution {
    static int isPatternPresent(String S, String P) {

        if (P.charAt(0) == '^') {
            if (S.startsWith(P.substring(1))) {
                return 1;
            }
        }

        else if (P.charAt(P.length() - 1) == '$') {
            if (S.endsWith(P.substring(0, P.length() - 1))) {
                return 1;
            }
        }

        else if (S.contains(P)) {
            return 1;
        }

        return 0;
    }
};