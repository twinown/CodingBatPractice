/*Return the sum of two 6-sided dice rolls, each in the range 1..6.
        However, if noDoubles is true, if the two dice show the same value,
        increment one die to the next value, wrapping around to 1 if its value was 6.
        withoutDoubles(2, 3, true) → 5
        withoutDoubles(3, 3, true) → 7
        withoutDoubles(3, 3, false) → 6*/
public class CodingBat115 {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        return die1==6&&die2==6&&noDoubles?die1+1:noDoubles&& die1==die2?die1+die2+1:die1+die2;
    }
}
