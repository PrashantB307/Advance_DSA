

//   https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

//   https://www.codingninjas.com/studio/problems/allocate-books_1090540


class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
       
        if(M > N){
            return -1;
        }
        int low = 0;
        for(int val : A){
            low = Math.max(val, low);
        }

        int high = 0;
        for(int val : A){
            high += val;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            
            int students = cntStudent(A, mid);
            if(students > M){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return low;
    }

    public static int cntStudent(int[] arr, int pages){
        int student = 1;
        int pageStudent = 0;
        for(int i = 0; i < arr.length; i++){
            if(pageStudent + arr[i] <= pages){
                pageStudent += arr[i];
            }else{
                student += 1;
                pageStudent = arr[i];
            }
        }

        return student;
    }
};