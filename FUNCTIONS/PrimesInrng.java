package FUNCTIONS;

public class PrimesInrng {
     public static boolean isPrime(int n){
       //corner cases 
       
       if(n==2 || n==3){
        return true;
       }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
            
        }
        return true;
    }
    public static void PrimesInrange(int a,int b){
        System.out.println("Primes in range: ");
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
            
        }

    }
    public static void main(String[] args) {

        PrimesInrange(10, 30);

        
    
}
    
}
