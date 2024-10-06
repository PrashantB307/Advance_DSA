import java.util.*;
class Abcedarian_Series {
    public static void main(String[] args) {
        String str1 = "ABCDEFGH";
        String str2 = "ate";

        List<String> list = new ArrayList<>();
        for(char ch : str1.toCharArray()){
            String s = ch + str2;
            list.add(s);
        }

        for(String s : list){
            System.out.print(s + " ");
        }
    }
}

//   Aate Bate Cate Date Eate Fate Gate Hate