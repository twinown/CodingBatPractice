/*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        countXX("abcxx") → 1
        countXX("xxx") → 2
        countXX("xxxx") → 3*/
public class CodingBat156 {
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.startsWith("xx", i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countXX("Hexxo thxxe"));
    }
}



