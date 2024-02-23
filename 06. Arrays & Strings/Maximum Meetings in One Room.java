

//    https://www.geeksforgeeks.org/problems/maximum-meetings-in-one-room/1

//    https://www.codingninjas.com/studio/problems/maximum-meetings_1062658


import java.util.*;
class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {

        ArrayList<Integer> list = new ArrayList<>();

        int[][] interval = new int[N][3];
        for(int i = 0; i < N; i++){
            interval[i][0] = S[i];
            interval[i][1] = F[i];
            interval[i][2] = i + 1;      // Position
        }

        Arrays.sort(interval, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

        int last = -1;
        for(int i = 0; i < N; i++){
            if(interval[i][0] > last){
                list.add(interval[i][2]);
                last = interval[i][1];
            }
        }

        Collections.sort(list);

        return list;
    }
}
   