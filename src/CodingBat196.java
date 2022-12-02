/*
Given a string, compute a new string by moving the first char to come after the next two chars,
        so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so
        "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
        oneTwo("abc") → "bca"
        oneTwo("tca") → "cat"
        oneTwo("tcagdo") → "catdog"*/
public class CodingBat196 {
    public static String oneTwo(String str) {
        String ns = "";
        for(int i = 0; i<=str.length()-3;i+=3){
            ns += str.substring(i+1,i+3)+str.charAt(i);
        }
        return ns;
    }

    public static void main(String[] args) {
        System.out.println(oneTwo("tcagdo"));
    }
}
