// Given a list of phone numbers, determine the validity of each of them without using regex or built-in phone 
// number parsers. The rules for validation are as follows:

// 1. The number must begin with +91 or 0 7, 8 or 9.
// 2. The number may contain spaces, but only in the national and international format as shown below.
//    International Format: +91 xxxxx xxxxx
//    National Format: 0xxxxx xxxxx
// 3. Apart from the spaces at certain positions and the plus symbol in +91, the rest of the phone number must be strictly made of digits.
// 4. The length of the actual phone number (excluding the prefix +91, 0, as well as the spaces in formatting) must be 10.
// Refer the sample input and output to better understand these rules.

// Sample Input
// 4
// +91 12345 67890
// 091234567890
// 0 9234 567890
// +911234567890

// Sample Output

// True
// False
// False
// True


import java.util.*;
class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String phoneNo = sc.nextLine();
            boolean valid = isValidNo(phoneNo);

            System.out.println(valid);
        }

        sc.close();
    }

    public static boolean isValidNo(String phoneNo) {
        phoneNo = phoneNo.replaceAll(" ", "");

        phoneNo = phoneNo.replace(" ", "");

        if (phoneNo.startsWith("+91")) {
            return phoneNo.length() == 13 && isAllDigits(phoneNo.substring(3));
        } else if (phoneNo.startsWith("0")) {
            return phoneNo.length() == 11
                    && (phoneNo.charAt(1) == '7' || phoneNo.charAt(1) == '8' || phoneNo.charAt(1) == '9')
                    && isAllDigits(phoneNo.substring(1));
        }

        return false;
    }

    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}