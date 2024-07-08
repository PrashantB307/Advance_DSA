

//   https://www.geeksforgeeks.org/problems/integral-points-in-triangle5026/1


class Solution {
    public long gcd(long a, long b) {
       if (b == 0) {
           return a;
       } else {
           return gcd(b, a % b);
       }
   }

   public long getPoints(long x1, long y1, long x2, long y2) {
       if (x1 == x2) {
           return Math.abs(y2 - y1) - 1;
       }
       if (y1 == y2) {
           return Math.abs(x2 - x1) - 1;
       }
       return gcd(Math.abs(x1 - x2), Math.abs(y1 - y2)) - 1;
   }

   public long InternalCount(long[] p, long[] q, long[] r) {
       long x1 = p[0], x2 = q[0], x3 = r[0];
       long y1 = p[1], y2 = q[1], y3 = r[1];

       long points = getPoints(x1, y1, x2, y2) + getPoints(x2, y2, x3, y3) + getPoints(x3, y3, x1, y1) + 3;
       long area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
       
       return (area - points + 2) / 2;
   }
}