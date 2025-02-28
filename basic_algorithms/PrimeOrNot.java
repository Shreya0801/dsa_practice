package basic_algorithms;

import java.util.Scanner;

public class PrimeOrNot {

    public void check_prime(int n){
        if(n==1){
            System.out.println(n+" is neither prine nor composite");
            System.exit(0);
        }
        int m = (int)Math.sqrt(n);
        int count=0;
        for (int i = 1; i <= m; i++) {
            if(m%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is prime");
        }
        else if (count>2) {
            System.out.println(n+" is a composite");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        PrimeOrNot p = new PrimeOrNot();
        p.check_prime(num);
        //int count=0;
        // for (int i = 2; i<=num; i++) {
        //     if(num % i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println(num+" is prime");
        // }
        // else if (count>2) {
        //     System.out.println(num+" is composite");   
        // }
        // else{
        //     System.out.println(num+" is neither prime nor composite");
        // }


        sc.close();
    }
}
