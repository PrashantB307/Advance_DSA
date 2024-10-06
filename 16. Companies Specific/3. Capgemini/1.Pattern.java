
class Pattern {
    public static void main(String[] args) {
        String str = "Hello#Prashant#How#Are#You";
        String s = "";
        String hash = "";

        for(char ch : str.toCharArray()){
            if(Character.isAlphabetic(ch)){
                s += ch;
            }else{
                hash += ch;
            }
        }

        String ans = hash.concat(s);

        System.out.println(ans);   //   ####HelloPrashantHowAreYou
    }    
}
