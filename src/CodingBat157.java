public class CodingBat157 {
    boolean doubleX(String str) {
        boolean bb = false;
        int m = str.indexOf('x');
        if (str.contains("xx") && str.charAt(m + 1) == 'x') {
            bb = true;
        }

        return bb;
    }
}
