package FUNCTIONS;

import java.util.Scanner;

public class Para {
    public static int calculateSum(int a,int b){//formal parameters
       
        
        
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b=sc.nextInt();
        int res=calculateSum(a,b);//arguments or actual parameters
        System.out.println("Sum= "+ res);
        
    }
    
}
