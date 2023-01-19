/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and
        ending with 'p'. Return a string where for all such words, the middle letter is
        gone, so "zipXzap" yields "zpXzp".
        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"*/
public class CodingBat197_imp_for_deleting_chars {
    public static String zipZap(String str) {
        for(int i = 0; i<=str.length()-3;i++){
            if(str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
                str = str.substring(0,i+1)+str.substring(i+2);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
    }

}
