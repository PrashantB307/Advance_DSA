// URLQueryParser
// Given a valid url and the names of one or more query parameters as key, determine the value for those keys
// in the URL without using regex or built-in url parsers.

// Note: Query parameters are a defined set of parameters attached to the end of a url. To append query
// params to the end of a URL, a '?' is added followed immediately by a query parameter. To add multiple
// parameters, an '&' is added in between each.

// CONSTRAINTS
// 1 <= N <= 1000

// Sample Input ==>

// http://www.delixu.com/career?test_param=google&param_1=india
// 2
// test_param
// param_15

// Sample Output ==>
// google
// -1


import java.util.*;
class Main2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String url = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] keys = new String[n];
        for(int i = 0; i < n; i++){
            keys[i] = sc.nextLine();
        }

        int idx = url.indexOf("?");

        String str = "";
        if(idx != -1){
            str = url.substring(idx + 1);
        }

        String[] pairs = str.split("&");

        HashMap<String, String> map = new HashMap<>();

        for(String pair : pairs){
            String[] keyVal = pair.split("=", 2);
            if(keyVal.length == 2){
                map.put(keyVal[0], keyVal[1]);
            }else{
                map.put(keyVal[0], "");
            }
        }

        for(String key : keys){
            if(map.containsKey(key)){
                System.out.println(map.get(key));
            }else{
                System.out.println("-1");
            }
        }

        sc.close();

    }
}
