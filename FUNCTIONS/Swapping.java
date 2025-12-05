package FUNCTIONS;

import java.util.Scanner;

public class Swapping {
    public static void swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=10;
        swap(a,b);


    }
    
}
