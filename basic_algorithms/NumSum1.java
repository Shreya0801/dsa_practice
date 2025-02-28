package basic_algorithms;

import java.util.Scanner;

public class NumSum1 {

    Scanner scanner = new Scanner(System.in); 

    public int sum(int n){
        int num,add = 0;
        System.out.println("Enter the numbers: ");
       for (int i = 0; i <n; i++) {
         num = scanner.nextInt();
         add = add + num;
       }
       return add;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int x = scanner.nextInt();

        NumSum1 n = new NumSum1();
        int num_sum = n.sum(x);
        System.out.println("Sum is: "+num_sum);
        scanner.close();
    }
}
