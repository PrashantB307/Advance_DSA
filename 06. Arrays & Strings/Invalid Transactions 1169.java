

//   https://leetcode.com/problems/invalid-transactions/

//   https://www.naukri.com/code360/problems/invalid-transactions_3167809


import java.util.*;
class Solution {
    public List<String> invalidTransactions(String[] transactions) {

        int n = transactions.length;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = transactions[i];
            String[] arr = str.split(",");

            String name = arr[0];
            int time = Integer.parseInt(arr[1]);
            int dollar = Integer.parseInt(arr[2]);
            String city = arr[3];

            if (dollar > 1000) {
                res.add(str);
            } else {
                boolean flag = false;

                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        String s = transactions[j];
                        
                        if (s.startsWith(name)) {
                            String[] temp = s.split(",");
                            
                            if (Math.abs(time - Integer.parseInt(temp[1])) <= 60 && !city.equals(temp[3])) {
                                flag = true;
                            }
                        }
                    }
                }

                if (flag) {
                    res.add(str);
                }
            }
        }

        return res;
    }
}