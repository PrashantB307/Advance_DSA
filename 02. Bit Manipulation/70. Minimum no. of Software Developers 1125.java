

//   https://leetcode.com/problems/smallest-sufficient-team/description/


import java.util.*;

class Main70 {

	static ArrayList<Integer> sol = new ArrayList<>();

	public static void solution(int[] people, int nskills, int cp, ArrayList<Integer> onesol, int skills) {
		// write your code here

        if(cp == people.length){
            if(skills == ((1 << nskills) - 1)){
                if(sol.size() == 0 || onesol.size() < sol.size()){
                    sol = new ArrayList<>(onesol);
                }
            }
            return;
        }

        solution(people, nskills, cp + 1, onesol, skills);

        onesol.add(cp);
        solution(people, nskills, cp + 1, onesol, (skills | people[cp]));
        onesol.remove(onesol.size() - 1);

	}
}