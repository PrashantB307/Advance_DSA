
class Main { 
    public static void main(String[] args) {
        
        // int n = 8;
        String path = "UDDDUDUU";
        int level = 0;
        int valley = 0;
        int depth = 0;

        for(char ch : path.toCharArray()){
            if(ch == 'U'){
                level++;
            }else{
                depth++;
                level--;
            }

            if(level == 0  && depth > 1){
                valley++;
                depth = 0;
            }
        }

        System.out.println(valley);
    }
}



// 1 0 -1 -2 -1 -2 -1 0