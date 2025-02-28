package basic_algorithms;

import java.util.Scanner;

public class Factorial {

    int recursive_fact(int n){
        if(n==0){
            return 1;
        }else{
            return n * recursive_fact(n-1);
        }
    }
    
    // public void fact_num(int n){
    //     int fact = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fact = fact*i;
    //     }
    //     System.out.println("Factorial is: "+fact);
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");;
        int num = sc.nextInt();
        Factorial fc = new Factorial();
        int num_fact = fc.recursive_fact( num);
        System.out.println("Factorial of "+num+" is: "+num_fact);
        sc.close();
    }
}
