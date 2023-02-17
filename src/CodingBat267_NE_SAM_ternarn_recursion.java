/*
Given a non-negative int n, return the sum of its digits recursively (no loops).
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        sumDigits(126) → 9
        sumDigits(49) → 13
        sumDigits(12) → 3*/
public class CodingBat267_NE_SAM_ternarn_recursion {
    public static int sumDigits(int n) {
        return n==0?0:sumDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(126));
    }
}
