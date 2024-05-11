

//   https://www.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1


class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    public pair indexes(long v[], long x) {
        int l = -1;
        int r = -1;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                l = i;
                break;
            }
        }

        if (l != -1) {
            for (int i = l; i < v.length; i++) {
                if (v[i] == x) {
                    r = i;
                } else {
                    break;
                }
            }

        }

        if (l == -1 && r == -1) {
            return new pair(l, r);
        }

        return new pair(l, r);

    }
}