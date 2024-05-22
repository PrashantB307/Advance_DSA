

//   https://www.geeksforgeeks.org/problems/shortest-direction4201/1


import java.util.*;
class Solution {
    String shortestPath(String S) {
        int x = 0;
        int y = 0;

        for (char ch : S.toCharArray()) {
            if (ch == 'N')
                y++;
            else if (ch == 'S')
                y--;

            if (ch == 'E')
                x++;
            else if (ch == 'W')
                x--;
        }

        StringBuilder sb = new StringBuilder();

        if (x > 0)
            sb.append("E".repeat(x));
        else if (x < 0)
            sb.append("W".repeat(Math.abs(x)));

        if (y > 0)
            sb.append("N".repeat(y));
        else if (y < 0)
            sb.append("S".repeat(Math.abs(y)));

        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}