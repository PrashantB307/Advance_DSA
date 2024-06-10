

//   https://www.geeksforgeeks.org/problems/find-rectangle-with-corners-as-1--141631/1


class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{ 
	    int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    continue;
                }

                for(int k = j + 1; k < n; k++){
                    if(matrix[i][k] == 0){
                        continue;
                    }

                    for(int l = i + 1; l < m; l++){
                        if(matrix[l][k] == 1 && matrix[l][j] == 1){
                            return true;
                        }
                    }
                }
            }
        }


        return false;
	}
}