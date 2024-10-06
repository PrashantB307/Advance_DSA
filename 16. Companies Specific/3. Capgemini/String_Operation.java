class String_Operation{
    public static int solver(String str){

        String[] arr = str.split(" ");
        int c = 0, v = 0;
        int soft = 0, hard = 0;
        int consuC = 0;

        for(String s : arr){
            for(char ch : s.toCharArray()){
                if(isVowel(ch)){
                    v++;
                    consuC = 0;
                }else{
                    c++;
                    consuC++;

                    if(consuC >= 3){
                        break;
                    }
                }
            }

            if(consuC >= 3 || c > v){
                hard++;
            }else{
                soft++;
            }

            c = 0;
            v = 0;
            consuC = 0;
        }

        return (5 * hard) - (2 * soft);
    } 

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "qiewldoaa life ace by fantasy";
        System.out.println(solver(s));

        s = "ease of accessibility is myth";
        System.out.println(solver(s));
    }
}