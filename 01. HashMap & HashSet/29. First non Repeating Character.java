


class Main29 {
	public static int solution(String s) {
		int []freq = new int[256];
        for(int i = 0 ; i <s.length(); i++){
            freq[s.charAt(i)]++;
        }

        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)] == 1){
                return i;
            }
        }

        return -1;
	 }
}

