package FUNCTIONSDPP;

public class Sumdig {
    public static int sumDigits(int num){
        int sum=0;
        while(num > 0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int number=12345;
        System.out.println("Sum of digits: "+ sumDigits(number));
        
    }
    
}
