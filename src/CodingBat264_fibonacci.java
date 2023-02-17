
/*The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
        The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent
        value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8,
        13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number,
        with n=0 representing the start of the sequence.
        fibonacci(0) → 0
        fibonacci(1) → 1
        fibonacci(2) → 1*/
public class CodingBat264_fibonacci {
    public int fibonacci(int n) {
        int numb;
        if(n==0){
            numb = 0;
        } else if (n==1){
            numb = 1;
        }else numb = fibonacci(n-2)+fibonacci(n-1);
        return numb;
    }

    public static int factorial(int n) {
        int fac;
         if (n == 1) {
        fac = 1;
        } else {
            fac = factorial(n - 1)*n;
        }
        return fac;
    }

    public static int bunnyEars(int bunnies) {
        int ears;
        if (bunnies==0){
            ears = 0;
        } else ears = bunnyEars(bunnies-1)+2;
        return ears;
    }

    public static void main(String[] args) {
   //     System.out.println(factorial(3));
        System.out.println(bunnyEars(3));
    }
}
