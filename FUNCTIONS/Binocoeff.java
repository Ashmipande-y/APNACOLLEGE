package FUNCTIONS;

public class Binocoeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;

    }
    public static int Binocoeff(int n,int r){
        int nfact=factorial(n);
        int rfact=factorial(r);
        int nmrfact=factorial(n-r);
        int ncr=nfact/rfact*nmrfact;
        return ncr;
    }
    public static void main(String[] args) {
        
        System.out.println(Binocoeff(5, 2));


        
    }
    
    
}
