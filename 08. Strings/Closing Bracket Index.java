

//   https://www.geeksforgeeks.org/problems/closing-bracket-index5900/1


class Sol {
    int closing(String s, int pos) {

        int op = 0;
        for(int i = 0; i < s.length(); i++){
            if(i <= pos){
                continue;
            }else{
                if(s.charAt(i) == '['){
                    op++;
                }else if(s.charAt(i) == ']'){
                    if(op == 0){
                        return i;
                    }
                    op--;
                }
            }

        }

        return -1;
    }
}