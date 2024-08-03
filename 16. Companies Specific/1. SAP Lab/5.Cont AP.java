
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 1; i < n - 1; i++){
            int j = i - 1, k = i + 1;

            while (j >= 0 && k < n) {
                if(arr[j] + arr[k] == 2 * arr[i]){
                    System.out.println(arr[j] + " " + arr[i] + " " + arr[k]);
                    k++;
                    j--;
                }else if(arr[j] + arr[k] < 2 * arr[i]){
                    k++;
                }else{
                    j--;
                }
            }
        }
    }
}