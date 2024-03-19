

//    https://www.geeksforgeeks.org/problems/huffman-decoding-1/1


class minHeapNode {
    int freq;
    char data;
    minHeapNode left, right;
    minHeapNode(char data, int freq){
        left = right = null;
        this.data = data;
        this.freq = freq;
    }
}

class GfG {

    String decodeString(minHeapNode root, String encodedStr){
       
        int n = encodedStr.length();
        String str = "";
        minHeapNode k = root;

        for(int i = 0; i < n; i++){
            char ch = encodedStr.charAt(i);

            if(ch == '0'){
                k = k.left;
            }
            if(ch == '1'){
                k = k.right;
            }
            if(k.data != '$'){
                str += k.data;
                k = root;
            }
        }

        return str;
    }
}


