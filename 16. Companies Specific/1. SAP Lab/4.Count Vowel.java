
import java.util.*;
class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        int k = sc.nextInt();
        int[][] ranges = new int[k][2];
        for(int i = 0; i < k; i++){
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }

        sc.close();
        
        for(int[] range : ranges){
            int st = range[0] - 1;
            int end = range[1] - 1;
            int cnt = 0;

            for(int i = st; i <= end; i++){
                if(isVowel(arr[i].charAt(0)) || isVowel(arr[i].charAt(arr[i].length() - 1))){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

    }

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        return false;
    }
}