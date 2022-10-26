/*
Given an array of scores sorted in increasing order,
        return true if the array contains 3 adjacent
        scores that differ from each other by at most 2,
        such as with {3, 4, 5} or {3, 5, 5}.
        scoresClump([3, 4, 5]) → true
        scoresClump([3, 4, 6]) → false
        scoresClump([1, 3, 5, 5]) → true*/
public class CodingBat124 {
    public boolean scoresClump(int[] scores) {
        boolean sc = false;
        for (int i = 0; i <= scores.length - 3; i++) {
            if ((scores[i + 2] == scores[i + 1])
                    || (scores[i + 1] - scores[i] < 2
                    && scores[i + 2] - scores[i + 1] < 2)) {
                sc = true;
            }
        }
        return sc;
    }
}