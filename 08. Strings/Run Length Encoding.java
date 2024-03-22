

//   https://www.geeksforgeeks.org/problems/run-length-encoding/1


class GfG
 {
	String encode(String str)
	{
        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i - 1) == str.charAt(i)){
                cnt++;
            }else{
                sb.append(str.charAt(i - 1));
                sb.append(cnt);
                cnt = 1;
            }
        }
        
        sb.append(str.charAt(str.length() - 1));
        sb.append(cnt);

        return sb.toString();
	}
	
}