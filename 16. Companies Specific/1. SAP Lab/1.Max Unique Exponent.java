class HelloWorld {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        String ans = "";
        int cnt = 1;
        int i;
        
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                ans += s.charAt(i);
                if (cnt > 1) {
                    ans += cnt;
                    cnt = 1;
                }
            }
        }

        ans += s.charAt(i);
        if (cnt > 1) {
            ans += cnt;
        }

        System.out.println(ans);
    }
}