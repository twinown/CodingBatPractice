<<<<<<< HEAD
public class CodingBat195 {

    public static String zipZap(String str) {


        String ns = "";
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.startsWith("z", i)&&str.startsWith("p",i+2)){
              //  str = str.charAt(i)+str.substring();
            }

                //    str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str =   str.charAt(i) + str.substring(i + 2);
                //str = str.replace(str.substring(i+1, i+2),"");
            }
     //   }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }
}
=======

/*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true*/
public class CodingBat195 {
    public static boolean sameStarChar(String str) {
        boolean b = true;
        for (int i = 1; i<str.length()-1;i++){
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar(""));
    }
}
>>>>>>> 04f709aecc462a130ab4e06f0322caf3cff7fbcd
