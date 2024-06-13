

//   https://leetcode.com/problems/baseball-game/description/


class Solution {
    public int calPoints(String[] oprerations) {
        
        int[] scores = new int[oprerations.length];
        int size = 0;
        
        for (String str : oprerations) {
            if (str.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            } else if (str.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            } else if (str.equals("C")) {
                size--;
            } else {
                scores[size] = Integer.parseInt(str);
                size++;
            }
        }
        
        int sum = 0;
        for (int val : scores) {
            sum += val;
        }
        
        return sum;
    }
}