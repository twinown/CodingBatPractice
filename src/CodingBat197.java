import java.util.Scanner;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and
        ending with 'p'. Return a string where for all such words, the middle letter is
        gone, so "zipXzap" yields "zpXzp".
        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"*/
public class CodingBat197 {
    public static String zipZap(String str) {
        for(int i = 0; i<=str.length()-3;i++){
            if(str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
                str = str.replace(str.substring(i+1,i+2),"");
            }
        }
        return str;
    }


}
