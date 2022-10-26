/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


        lessBy10(1, 7, 11) → true
        lessBy10(1, 7, 10) → false
        lessBy10(11, 1, 7) → true*/
public class CodingBat114 {
    public boolean lessBy10(int a, int b, int c) {
        return
                a-b<=-10||b-a<=-10||
                        a-c<=-10||c-a<=-10||
                        b-c<=-10||c-b<=-10;
    }
}
