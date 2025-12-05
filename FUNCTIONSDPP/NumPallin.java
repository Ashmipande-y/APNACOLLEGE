package FUNCTIONSDPP;

public class NumPallin {

    public static boolean pallin(int n){
        int num=n;
        int reverse=0;
        while(n>0){
            int ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;




        }
        if(num==reverse)
            return true;

        
            
        
        else return false;
        
    }
    public static void main(String[] args) {
        int num=321;
        System.out.println(pallin(num));

    }
    
}
