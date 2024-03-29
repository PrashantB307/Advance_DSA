

//    https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-3-official/ojquestion


import java.io.*;
import java.util.*;

class Main30 {

    public static void generateSelections(int j, String ustr, HashMap<Character, Integer> unique, int ssf, int ts, String asf){

        if(j == ustr.length()){
            if(ssf == ts){
                System.out.println(asf);
            }

            return;
        }

        char ch = ustr.charAt(j);
        for(int count = unique.get(ch); count >= 0; count--){
            String toadd = "";
            for(int i = 0; i < count; i++){
                toadd += ch;
            }

            generateSelections(j + 1, ustr, unique, ssf + count, ts, asf + toadd);
        }
    }

  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }

    generateSelections(0, ustr, unique, 0, k, "");
   
  }

}