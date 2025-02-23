package basic_algorithms;

import java.util.Scanner;

// Swap without using temporary variable.....
public class Swap2 {
    public static void swap(int a, int b){
        System.out.println("Before swapping a = "+a+" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "+a+" b = "+b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take number from user: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        swap(x, y);
       
        sc.close();
    }

}