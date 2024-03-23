

//   https://www.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1

//   https://www.codingninjas.com/studio/problems/program-to-validate-ip-address_981315


class Solution {

    public boolean isValid(String s) {

        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '.') {
                cnt++;
            }
        }

        String[] parts = s.split("\\.");
        if (cnt != 3 || parts.length != 4) {
            return false;
        }

        for (String str : parts) {
            try {
                int value = Integer.parseInt(str);
                if (value < 0 || value > 255)
                    return false;
                if (str.length() > 1 && str.charAt(0) == '0')
                    return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
}