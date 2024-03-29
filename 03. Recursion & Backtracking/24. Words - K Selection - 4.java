

//   https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-4-official/ojquestion


import java.util.*;
import java.io.*;
class Main31 {

    public static void generateSelections(int cs, int ts, HashMap<Character, Integer> map, Character [] spots, String ustr, int ls){
        if(cs == ts){
            for(int i = 0; i < spots.length; i++){
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }

        for(int i = ls; i < ustr.length(); i++){
            char ch = ustr.charAt(i);
            int freq = map.get(ch);

            if(freq > 0){
                map.put(ch, map.get(ch) - 1);
                spots[cs] = ch;
                generateSelections(cs + 1, ts, map, spots, ustr, i);
                spots[cs] = null;
                map.put(ch, map.get(ch) + 1);
            }
        }
    }
  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> map = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (map.containsKey(ch) == false) {
        map.put(ch, 1);
        ustr += ch;
      } else {
        map.put(ch, map.get(ch) + 1);
      }
    }

    Character[] spots = new Character[k];
    generateSelections(0, k, map, spots, ustr, 0);
  }

}