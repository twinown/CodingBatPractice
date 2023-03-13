public class CodingBat288 {
    public static boolean strCopies(String str, String sub, int n) {
        int i = sub.length();
        if(n==0){
            return true;
        }
        if (str.length()>0) {
            if (str.startsWith(sub)) {
                return strCopies(str.substring(1), sub, n - 1);
            } else return strCopies(str.substring(1), sub, n);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }
}
