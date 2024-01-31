

//   https://leetcode.com/problems/reverse-bits/


import java.util.*;
class Main95 {

    public static void solution(int[] arr) {
        
        Arrays.sort(arr);
        ArrayList<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            int xor = arr[i] ^ arr[i + 1];
            if(xor < min){
                min = xor;
                res = new ArrayList<>();
                res.add(arr[i] + ", " + arr[i + 1]);
            }else if(xor == min){
                res.add(arr[i] + ", " + arr[i + 1]);
            }
        }

        for(String str : res){
            System.out.println(str);
        }
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

//    https://practice.geeksforgeeks.org/problems/minimum-xor-value-pair/1


class Sol2{

    static int minxorpair(int N, int arr[]){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            int xor = arr[i] ^ arr[i + 1];
            if(xor < min){
                min = xor;
            }
        }

        return min;
    }
}