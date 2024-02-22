

//   https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1


class Pair {  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for(long val : a){
            if(val > max){
                max = val;
            }
            
            if(val < min){
                min = val;
            }
        }

        return new Pair(min,max);
    }
}