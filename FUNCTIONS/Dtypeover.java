package FUNCTIONS;

public class Dtypeover {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    

    public static void main(String[] args) {
        int a=5;
        int b=6;
        float c=5.6f;
        float d=9.8f;
        System.out.println(sum(a,b));
        System.out.println(sum(c,d));
        
    }
    
}
