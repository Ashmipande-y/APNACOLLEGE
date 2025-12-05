package FUNCTIONS;

public class Dectobin {

    public static void decTobin(int a){
        int n=a;
        int num=n;
        int bin=0;
        int pow=0;
        while(n>0){
            int ld=n%2;
            bin=bin+ld*(int)(Math.pow(10, pow));
            pow++;
            n=n/2;

        }
        System.out.println("The bin of "+ num + "is: "+ bin);

    }
    public static void main(String[] args) {
        decTobin(98);
        
    }

    
    
}
