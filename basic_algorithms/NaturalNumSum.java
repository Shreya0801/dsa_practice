package basic_algorithms;

import java.util.Scanner;

public class NaturalNumSum {
    int recursive_sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return recursive_sum(n-1) + n;
        }
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        NaturalNumSum n = new NaturalNumSum();
        int Sum = n.recursive_sum(num);
        System.out.println("Sum of first "+num+" natural numbers :"+Sum);
        sc.close();
    }
}
