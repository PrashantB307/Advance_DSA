

//  https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1


import java.util.*;
class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < c; j++) {
                list.add(a[i][j]);
            }

            if (!res.contains(list)) {

                res.add(list);
            }
        }

        return res;

    }
}