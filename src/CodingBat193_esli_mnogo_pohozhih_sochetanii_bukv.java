public class CodingBat193_esli_mnogo_pohozhih_sochetanii_bukv {
    public static boolean xyzMiddle(String str) {
        //решение почти прошло...но other tests красный
        return str.length()>2&&(str.charAt(str.length()/2)=='y'||
                str.charAt((str.length()-1)/2)=='y');

        //верное короткое решение
     /*   while (str.length() > 4 )
        {
            str = str.substring(1, str.length() - 1 );
        }
        return(str.contains("xyz"));*/

    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyzAxyzBxyz"));
    }
}
