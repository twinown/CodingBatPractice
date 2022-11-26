
/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
        later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
        true if the given string is xy-balanced.
        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false*/
public class CodingBat187 {
    public static boolean xyBalance(String str) {
        boolean b = false;
        for (int j = 0; j < str.length(); j++) {
            if ((str.charAt(j) == 'x' && str.substring(j + 1)
                    .contains("y") || !str.contains("x"))) {
                b = true;
                break;
            }
        }
        if(str.length()>1){
            if(str.charAt(str.length()-1)=='x'&&
                    str.charAt(str.length()-2)=='y'){
                b = false;
            }
        } else b  = str.length() != 1 || str.charAt(0) != 'x';

        return b;
    }

    public static void main(String[] args) {
        System.out.println(xyBalance(""));
    }
}
