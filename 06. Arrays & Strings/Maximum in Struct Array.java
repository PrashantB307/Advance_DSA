

//   https://www.geeksforgeeks.org/problems/maximum-in-struct-array/1


class Height {
    int feet;
    int inches;

    public Height(int ft, int inc) {
        feet = ft;
        inches = inc;
    }
}

class GfG {
    public static int findMax(Height arr[], int n) {
        
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int sum = arr[i].feet * 12 + arr[i].inches;

            max = Math.max(max, sum);
        }

        return max;
    }
}