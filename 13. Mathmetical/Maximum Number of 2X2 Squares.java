

//    https://www.geeksforgeeks.org/problems/maximum-number-of-22-squares/1


class Solution
{
    public static long numberOfSquares(long base)
    {
        long a = base / 2;
        
        return a * (a - 1) / 2;
    }
}
