// In the city there are a bunch of delalersip who shell bikes & cars. A function is there which tells how many 
// delearship there and the total no. of cars in each delearship. Your job is to calculate how many tyres would b there 
// in each delearship.
// If u are using thepe=redefined function use this structure
// Struct dealership{
//     int cars;
//     int bikes;
// }


import java.util.*;
class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            int c = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(c * 4 + b * 2);
        }

        sc.close();
    }

}