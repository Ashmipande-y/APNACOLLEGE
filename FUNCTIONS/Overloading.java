package FUNCTIONS;

public class Overloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    

    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        
    }
    
}
