

//  https://www.geeksforgeeks.org/problems/word-search-1664453028/1


class Solution {

    public static boolean wordSearch(char m[][], String w) {

        int p = m.length;
        int q = m[0].length;

        StringBuilder s = new StringBuilder();
        boolean visited[][] = new boolean[p][q];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                if (m[i][j] == w.charAt(0)) {
                    if (dfs(visited, m, w, s, i, j, 0, p, q) == true)
                        return true;
                }
            }
        }
        
        return false;
    }

    static boolean dfs(boolean[][] visited, char[][] m, String w, StringBuilder s, int i, int j, int len, int p,
            int q) {

        if (len == w.length())
            return true;

        if (i < 0 || j < 0 || i >= p || j >= q || visited[i][j])
            return false;

        if (m[i][j] != w.charAt(len))
            return false;

        s.append(m[i][j]);

        visited[i][j] = true;

        if (dfs(visited, m, w, s, i - 1, j, len + 1, p, q) || dfs(visited, m, w, s, i + 1, j, len + 1, p, q)
                || dfs(visited, m, w, s, i, j - 1, len + 1, p, q) || dfs(visited, m, w, s, i, j + 1, len + 1, p, q))
            return true;

        s.deleteCharAt(s.length() - 1);

        visited[i][j] = false;

        return false;

    }

}
