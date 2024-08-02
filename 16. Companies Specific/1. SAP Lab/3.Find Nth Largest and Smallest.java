import java.util.*;
class Main{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 3;

        Arrays.sort(arr);

        System.out.println(arr[n - 1] + " " + arr[arr.length - n]);
    }
}