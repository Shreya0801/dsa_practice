package basic_algorithms;

import java.util.Scanner;
//import java.math.*;

public class MaxNum{

    // using conditional operator.....
    public void max_num(int a,int b){
        int max;
        if(a>b){
            max = a;
        }else{
            max=b;
        }
        System.out.println("Maximum number: "+max);  
    }

    // using ternary operator......
    public void max_num1(int a1,int b1){
        int max = (a1 > b1) ? a1 : b1;
        System.out.println("Maximum number is : "+max);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        MaxNum mn = new MaxNum();
        mn.max_num(x, y);
        mn.max_num1(x,y);
        System.out.println("Maximum number by Math func: "+Math.max(x,y));
        sc.close();
    }
}