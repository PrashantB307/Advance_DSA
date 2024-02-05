

//   https://www.geeksforgeeks.org/problems/predict-the-column/1


class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int cnt = 0;
        int row = -1;
        
        for(int i = 0; i < N; i++){
             int c = 0;
            for(int j = 0; j < N; j++){
               
                if(arr[j][i] == 0){
                    c++;
                }
            }
            
            if(c > cnt){
                cnt = c;
                row = i;
            }
            
        }
        
        return row;
    }
}