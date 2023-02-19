/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of
        base to the n power, so powerN(3, 2) is 9 (3 squared).
        powerN(3, 1) → 3
        powerN(3, 2) → 9
        powerN(3, 3) → 27*/
public class CodingBat270 {
    public static int powerN(int base, int n) {
        int sole;
        if (n==1){
            sole = base;
        } else sole  = powerN(base, n-1)*base;
        return sole;
    }

    public static void main(String[] args) {
        System.out.println(powerN(3,3));
    }
}
