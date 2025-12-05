package FUNCTIONS;

public class Bintodec {
    public static void main(String[] args) {
        int n=111;
        int num=n;
        int dec=0;
        int pow=0;
        while(n>0){
            int ld=n%10;
            dec=dec+ld*(int)(Math.pow(2, pow));
            pow++;
            n=n/10;

        }
        System.out.println("The decimal of "+ num + "is: "+ dec);
    }
    
}
