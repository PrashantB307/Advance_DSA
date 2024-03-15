

//   https://www.geeksforgeeks.org/problems/alternate-vowel-and-consonant-string2939/1


class Solution{
    public String rearrange(String S, int N){
        
        int[] vowel = new int[26];
        int[] consot = new int[26];
        int nv = 0;    // nv = no. of vowels
        int nc = 0;    // nc = no. of consonant
        char sv = 'u'; // sv = smallest vowel
        char sc = 'z'; // sc = smallest consonant


        for(char ch : S.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel[ch - 'a']++;
                nv++;
                sv = (char)Math.min((int)sv, (int)ch);
            }else{
                consot[ch - 'a']++;
                nc++;
                sc = (char)Math.min((int)sc, (int)ch);
            }
        }

        if(Math.abs(nv - nc) > 1){
            return "-1";
        }

        boolean isVowel = false;

        if(nv > nc){
            isVowel = true;
        }else if(nv < nc){
            isVowel = false;
        }else{
            if(sv < sc){
                isVowel = true;
            }else{
                isVowel = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < 26 && j < 26) {
            if(isVowel){
                while (i < 26 && vowel[i] == 0) {
                    i++;
                }
                if(i == 26){
                    break;
                }

                sb.append((char)('a' + i));
                vowel[i]--;
                isVowel = false;
            }else{
                while (j < 26 && consot[j] == 0) {
                    j++;
                }
                if(j == 26){
                    break;
                }

                sb.append((char)('a' + j));
                consot[j]--;
                isVowel = true;
            }
        }


        return sb.toString();
    }
}