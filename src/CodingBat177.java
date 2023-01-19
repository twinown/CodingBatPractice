/*
Given 2 int values greater than 0, return whichever value is nearest to 21
        without going over. Return 0 if they both go over.
        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19*/
public class CodingBat177 {
    public int blackjack(int a, int b) {
        int max =0;
        if(a<22&&b<22){
            max = Math.max(a, b);
        } else if(a>21){
            max = b;
        } else max = a;
        if (a>21 && b>21){
            max = 0;
        }
        return max;
    }

}
