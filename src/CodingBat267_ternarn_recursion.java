public class CodingBat267_ternarn_recursion {
    public static int sumDigits(int n) {
        return n==0?0:sumDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(126));
    }
}
