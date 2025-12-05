package FUNCTIONSDPP;
// Question 1 :Write a Java method to compute the averageof three numbers.
public class Average {
    public static int average(int a,int b,int c){
        int average=a+b+c/3;
        return average;
    }
    public static void main(String[] args) {
       System.out.println(average(4, 5, 10)); 

        
    }
    
}
