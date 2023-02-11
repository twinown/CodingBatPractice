/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
        Compute the result recursively (without loops).
        factorial(1) → 1
        factorial(2) → 2
        factorial(3) → 6*/
public class CodingBat143_recursion {
    public static int factorial(int n) {
     //   int result;
        return n==1?1:factorial(n-1)*n;
       /* if(n==1){
            result =1;
        } else
            result = factorial(n-1)*n;
        return result;*/
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
