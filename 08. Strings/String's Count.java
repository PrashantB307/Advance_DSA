

//    https://www.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints1135/1


class Solution 
{ 
    static long countStr(long n)
	{
	   return 1 + n + n + n * (n - 1) + n * (n - 1) / 2 + n * (n - 1) * (n - 2) / 2;
	}
} 