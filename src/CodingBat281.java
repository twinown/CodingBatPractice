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
