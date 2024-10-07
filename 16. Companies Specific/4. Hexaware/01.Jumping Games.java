// Jumping Games ===>

// This is a game where there are steps numbered from 0 to n steps. You will be on the nth step at the 
// start of the game. Your goal is to reach the 0th step at the end of the game with the minimum number of jumps.
// If the step number is even, you are allowed to jump n/2 steps below at maximum. If the step number is odd, 
// you are allowed to jump (n-1)/2 steps below at maximum.Now find the minimum number of steps required to win
// this game from the given input.

// Example:
// Input: 10
// Output: 5


import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int steps = 0;

        while(n > 0){
            if(n % 2 == 0){
                n = n / 2;
                steps++;
            }else{
                n = n - 1;
                steps++;
            }
        }

        System.out.println(steps);

        sc.close();
    }
}