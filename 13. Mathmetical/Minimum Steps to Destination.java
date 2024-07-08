

//  https://www.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1


class Solution{
    static int minSteps(int D){
        
        int sum = 0;
        int step = 0;

        while(sum < D){
            step++;
            sum += step;
        }

        while((sum - D) % 2 != 0) {
            step++;
            sum += step;
        }

        return step;
    }
}