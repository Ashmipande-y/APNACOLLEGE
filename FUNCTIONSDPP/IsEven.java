package FUNCTIONSDPP;
public class IsEven {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;

        
    }

    public static void main(String[] args) {
        int n=14;
        System.out.println(isEven(n));

        
    }
    
}
