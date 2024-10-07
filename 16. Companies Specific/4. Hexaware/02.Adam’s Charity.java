// Adam’s Charity ===>

// Adam decides to be generous and do some charity. Starting today, from day 1 until day n, 
// he gives (i^2) coins to charity on day (i) (1 ≤ i ≤ n). Return the total coins, he would give to charity.

// Example 1:
// Input: 2
// Output: 5

// Example 2:
// Input: 3
// Output: 14


import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int coins = 0;
        for(int i = 1; i <= n; i++){
            coins += (i * i);
        }

        System.out.println(coins);

        sc.close();
    }
}