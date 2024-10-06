import java.util.*;
class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[t][2];

        for(int i = 0; i < t; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i][0] + " ");
        }

        sc.close();

    }
}
