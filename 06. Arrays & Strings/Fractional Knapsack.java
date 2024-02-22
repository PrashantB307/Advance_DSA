

//   https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1


import java.util.*;
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class Solution
{
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
       double ans = 0;
       Arrays.sort(arr, Comparator.comparing( (Item a) -> 
        (double) a.value / a.weight).reversed());

        for(Item item : arr){
            if(item.weight <= W){
                ans += item.value;
                W -= item.weight;
            }else{
                ans += (double)(W * item.value) / item.weight;
                break;
            }
        }

        return ans;
    }
}