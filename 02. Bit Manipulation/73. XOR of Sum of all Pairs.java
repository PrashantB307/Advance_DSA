



class Main73 {

    public static int solution(int[] arr){
      
        int xor = 0;
        for(int ele : arr){
            xor = xor ^ ele;
        }
       
       return 2 * xor;
    }    
}