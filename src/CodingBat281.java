/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
        countAbc("abc") → 1
        countAbc("abcxxabc") → 2
        countAbc("abaxxaba") → 2*/
public class CodingBat281 {
    public static int countAbc(String str) {
        if (str.length()>=3) {
            if (str.startsWith("abc") || str.startsWith("aba")) {
                return countAbc(str.substring(1)) + 1;
            } else return countAbc(str.substring(1));
        } else return 0;
    }

    public static void main(String[] args) {
        System.out.println(countAbc("abaxxabc"));
    }
}
