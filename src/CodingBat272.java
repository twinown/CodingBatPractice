public class CodingBat272 {
    public static int countHi(String str) {
        int count = 0;
        if (count == str.length()) {
            return 0;
        } else if (str.startsWith( "hi",count)) {
            count++;
        }
        return count + countHi(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countHi("xhixhix"));
    }
}
