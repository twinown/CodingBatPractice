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
