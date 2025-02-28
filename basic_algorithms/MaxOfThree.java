package basic_algorithms;

import java.util.Scanner;

public class MaxOfThree {
    public int max(int x,int y,int z){
        if (x>y && x>z) {
            return x;
        } else if (x<y && y>z) {
            return y;
        } else{
            return z;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three numbers: ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        MaxOfThree mx = new MaxOfThree();
        int max_of_three = mx.max(x, y, z);
        System.out.println("Maximum of "+x+" "+y+" "+z+" is: "+max_of_three);
        sc.close();
    }
}
