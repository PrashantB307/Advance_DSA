// The Puzzle Masters of Puzzleville

// In the bustling city of Puzzleville, a young prodigy Zoey stumbled upon a mysterious challenge left by a renowned puzzle master. Determined to solve it, she attempted to solve it.
// Her mission was to arrange the pieces in unique combinations that would sum up to a magic number provided by the puzzle master. No piece can be used more than once in a combination. To help her crack the puzzle and reveal the secret prize, find the numbers of unique combinations that are possible.

// INPUT The first line of input contains positive integers N, representing the number of pieces and K, representing the magic number, separated by a space. The next line contains the N numbers of positive integers, all that represent the pieces.
// OUTPUT Print the number of combinations that are possible.
// CONSTRAINTS 2 <= N <= 10^5 2 <= K <= N 1 <= Ai <= 10^9

// Input  ==>
// 7 8 
// 10 1 2 7 6 1 5
// Output ==>  4


import java.util.*;
class Main5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] pieces = new int[N];
        for (int i = 0; i < N; i++) {
            pieces[i] = scanner.nextInt();
        }
        scanner.close();
        
        Arrays.sort(pieces);
        
        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(pieces, K, 0, new ArrayList<>(), combinations);

        System.out.println(combinations.size());
    }

    public static void findCombinations(int[] pieces, int target, int start, List<Integer> current, List<List<Integer>> combinations) {
        if (target == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < pieces.length; i++) {
            if (i > start && pieces[i] == pieces[i - 1]) continue; 
            if (pieces[i] > target) break; 
            
            current.add(pieces[i]);
            findCombinations(pieces, target - pieces[i], i + 1, current, combinations);
            current.remove(current.size() - 1); 
        }
    }
}