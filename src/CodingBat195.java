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