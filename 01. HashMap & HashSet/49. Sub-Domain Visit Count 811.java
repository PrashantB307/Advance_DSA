

//  https://leetcode.com/problems/subdomain-visit-count/submissions/


import java.util.*;
class Main49 {

    public static List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String domain : cpdomains) {
            String tmp[] = domain.split(" ");
            int count = Integer.parseInt(tmp[0]);

            String words[] = tmp[1].split("\\.");

            StringBuilder sb = new StringBuilder();

            for (int idx = words.length - 1; idx >= 0; idx--) {
                if (idx == words.length - 1) {
                    sb.append(words[idx]);
                } else {
                    sb.insert(0, ".");
                    sb.insert(0, words[idx]);
                }

                String subDomain = sb.toString();

                if (map.containsKey(subDomain) == true) {
                    map.put(subDomain, map.get(subDomain) + count);
                } else {
                    map.put(subDomain, count);
                }
            }

        }

        ArrayList<String> res = new ArrayList<>();

        for (String subDomain : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get(subDomain));
            sb.append(" ");
            sb.append(subDomain);
            res.add(sb.toString());
        }

        return res;
    }
}
