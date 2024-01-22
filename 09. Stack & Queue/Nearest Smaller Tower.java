

//   https://www.geeksforgeeks.org/problems/nearest-smaller-tower--170647/1


import java.util.*;
class Solution{
	int [] nearestSmallestTower(int [] arr){
	Stack<Integer> stack = new Stack<>();
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int ans[] = new int[n];
		for(int i = 0;i<n;i++)
		{
		    while(stack.size()!=0 && arr[stack.peek()] >= arr[i])
		    {
		        stack.pop();
		    }
		    if(stack.size() == 0)
		        left[i]  = -1;
		    else
		    {
		        left[i] = stack.peek();
		    }
		    stack.push(i);
		}
		stack.clear();
		for(int i = n-1;i>=0;i--)
		{
		    while(stack.size()!=0 && arr[stack.peek()] >= arr[i])
		    {
		        stack.pop();
		    }
		    if(stack.size() == 0)
		        right[i]  = -1;
		    else
		    {
		        right[i] = stack.peek();
		    }
		    stack.push(i);
		}
		for(int i = 0;i<n;i++)
		{
		    if(left[i] == -1 && right[i] == -1)
		    {
		        ans[i] = -1;
		    }
		    else if(left[i] == -1 && right[i]!=-1)
		    {
		        ans[i] = right[i];
		    }
		    else if(left[i] != -1 && right[i] ==-1)
		    {
		        ans[i] = left[i];
		    }
		    else
		    {
		        if(Math.abs(i-left[i]) < Math.abs(i-right[i]))
		        {
		            ans[i] = left[i];
		        }
		        else if(Math.abs(i-left[i]) > Math.abs(i-right[i]))
		        {
		            ans[i] = right[i];
		        }
		        else if(Math.abs(i-left[i]) == Math.abs(i-right[i]))
		        {
		            if(arr[left[i]] <= arr[right[i]])
		            {
		                ans[i] = left[i];
		            }
		            else
		            {
		                ans[i] = right[i];
		            }
		        }
		    }
		}
		return ans;
	}
}