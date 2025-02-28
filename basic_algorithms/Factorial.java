package basic_algorithms;

import java.util.Scanner;

public class Factorial {
    
    public void fact_num(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");;
        int num = sc.nextInt();
        Factorial fct = new Factorial();
        fct.fact_num( num);
        sc.close();
    }
}
