public class CodingBat285 {
    public static  String parenBit(String str) {
        if (str.charAt(0)!='('&&str.charAt(0)!='*'){
         str =  parenBit(str.substring(1));
        } else if (str.charAt(0)=='('){
            int b = str.indexOf(")");
            String c = str.substring(0, b + 1);
            str = str.replace(c, "*");
            str =""+  str.charAt(0);
           str = str.replace("*", c);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
    }
}
