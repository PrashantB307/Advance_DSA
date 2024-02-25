

//    https://leetcode.com/problems/watering-plants/description/

//    https://www.codingninjas.com/studio/problems/watering-flowers_2264968


class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap = capacity;
        int step = 0;

        for(int i = 0; i < plants.length; ){
            if(cap >= plants[i]){
                cap -= plants[i];
                step++;
                i++;
            }else{
                step += 2 * i;   
                cap = capacity;   // Refill the bucket
            }
        }

        return step;
    }
}