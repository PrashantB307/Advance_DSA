

//   https://www.geeksforgeeks.org/problems/magical-box5306/1


class Solution {
    double maxVolume(double peri, double area) {
        double l = (peri - Math.sqrt(Math.pow(peri, 2) - 24 * area)) / 12;
        double h = peri / 4 - 2 * l;
        
        double ans = l * l * h;

        return ans;
    }
}