

//   https://www.interviewbit.com/problems/palindromic-binary-representation/


class Main96 {

    public static int revBin(int n) {
        int rev = 0;
        while (n > 0) {
            int m = (n & 1);
            rev |= m;
            n = n >> 1;
            rev = rev << 1;
        }
        return (rev >> 1);
    }

    public static int NthPalindromicBinary(int n) {
        int grpNo = 1;
        int count = 1;
        while (count < n) {
            grpNo++;
            count += (1 << ((grpNo - 1) / 2));
        }
        count -= (1 << (grpNo - 1) / 2);
        int offset = n - count - 1;

        int ans = 1;

        ans |= (1 << (grpNo - 1));
        ans |= (offset << (grpNo / 2));
        int val = ans >> (grpNo / 2);
        int rev = revBin(val);

        ans |= rev;
        return ans;
    }
}


                        
                        