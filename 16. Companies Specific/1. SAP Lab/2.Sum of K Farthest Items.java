
import java.util.*;
class Main {

    static class Pair {
        int val;
        int dis;

        Pair(int val, int dis) {
            this.val = val;
            this.dis = dis;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 21, 4, 15, 17, 11 };
        int k = 3;
        int x = 20;

        Pair[] temp = new Pair[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = new Pair(arr[i], Math.abs(x - arr[i]));
        }

        Arrays.sort(temp, (a, b) -> b.dis - a.dis);

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += temp[i].val;
        }

        System.out.println(sum);

    }
}
