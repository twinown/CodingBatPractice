/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
        it does not count towards the sum.
        loneSum(1, 2, 3) → 6
        loneSum(3, 2, 3) → 2
        loneSum(3, 3, 3) → 0*/
public class CodingBat172 {
    public int loneSum(int a, int b, int c) {
        return a==b&&a==c?0:a!=b&&a!=c&&b!=c?a+b+c:a==c?b:a==b?c:a;
    }

}
