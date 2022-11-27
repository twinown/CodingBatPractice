public class CodingBat193 {
    public static boolean xyzMiddle(String str) {
        int x = 0;
        int z = 0;
        for (int i = 0; i <=str.length() -3; i++) {
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='y'
                    &&str.charAt(i+2)=='z'){
                x = i;
                z = i+2;
            }
        }
        return Math.abs(str.substring(0, x).length()-str.substring(z+1).length())<=1;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("1x345xyz12x4"));
    }
}
