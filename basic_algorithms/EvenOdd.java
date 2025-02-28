package basic_algorithms;

import java.util.Scanner;

public class EvenOdd{
    public void even_odd(int num){
        if(num % 2 == 0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        EvenOdd evenodd = new EvenOdd();
        evenodd.even_odd(x);
        sc.close();
    }
}