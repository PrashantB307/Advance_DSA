

//   https://leetcode.com/problems/fraction-addition-and-subtraction/


class Solution {
    public String fractionAddition(String expression) {
        
        int numerator = 0, denominator = 1; 
        int i = 0, n = expression.length();

        while (i < n) {
            int sign = 1; 

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                sign = (expression.charAt(i) == '-') ? -1 : 1;
                i++;
            }

            int numStart = i;
            while (i < n && Character.isDigit(expression.charAt(i))){
                i++;
            }

            String currNumer = expression.substring(numStart, i);
            int currentNumerator = Integer.parseInt(currNumer) * sign;
            i++;

            int denomStart = i;
            while (i < n && Character.isDigit(expression.charAt(i))){
                i++;
            }

            String currDenom = expression.substring(denomStart, i);
            int currentDenominator = Integer.parseInt(currDenom);

            numerator = numerator * currentDenominator + currentNumerator * denominator;
            denominator *= currentDenominator;

            int gcd = gcd(Math.abs(numerator), denominator);
            
            numerator /= gcd;
            denominator /= gcd;
        }

        return numerator + "/" + denominator;
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }
}