// Ticket Encoding Sequence

// You are working at a ticketing company that generates unique ticket codes for various events. The ticket
// codes are generated based on a specific encoding sequence.

// The encoding sequence follows the recursive formula as described below:

// 1. The ticket code for the first ticket (ticket #1) is "A".
// 2. To generate the ticket code for the next ticket (ticket #2), you would use the ticket code for the
// previous ticket (ticket #1). In this case, the ticket code for ticket #1 is "A", so the ticket code for ticket #2
// is "1A" (one A).
// 3. For ticket #3, you would use the ticket code for ticket #2, which is "1A". Now, split it into the minimal
// number of substrings, each containing exactly one unique character, i.e., "1" and "A". Now, use the
// number of digits in each substring followed by the digit itself. So, for ticket #3, the ticket code is "111A"
// (three 1's and one A).
// 4. For ticket #4, you would use the ticket code for ticket #3, which is "111A". Split it into substrings with
// unique characters: "111" and "A". Use the number of digits in each substring, followed by the digit itself.
// Therefore, the ticket code for ticket #4 is "311A" (three 1's, one 3, and one A). Continue this process to
// generate the ticket codes for subsequent tickets.

// Your task is to print the Nth ticket code.

// INPUT
// The first line of input contains positive integer N.
// N is the Nth ticket.

// OUTPUT
// Print the ticket code.

// CONSTRAINTS
// 1 <= N <= 30

// Example Input
// 4


import java.util.*;
class Main3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = generateTicket(n);

        System.out.println(result);
        sc.close();
    }

    public static String generateTicket(int n){
        if(n == 1){
            return "A";
        }

        String prev = generateTicket(n - 1);

        return encode(prev);
    }

    public static String encode(String str){

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char ch = str.charAt(0);
        
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){
                cnt++;
            }else{
                sb.append(cnt).append(ch);
                ch = str.charAt(i);
                cnt = 1;
            }
        }

        sb.append(cnt).append(ch);

        return sb.toString();
    }
}