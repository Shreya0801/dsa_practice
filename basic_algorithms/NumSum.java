package basic_algorithms;

import java.util.Scanner;
/*Take n nunber as input from the user.
 * Take SUM as variable to store the sum of all the number.
 * Print the SUM
 */
public class NumSum {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers ?");
        int n = sc.nextInt();

        int x , sum = 0;
        System.out.println("Which number ?..");
        for (int i = 0; i < n; i++) {

            x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
    
    
}
