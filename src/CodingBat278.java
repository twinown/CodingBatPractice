/*
Given a string, compute recursively a new string where identical chars that
        are adjacent in the original string are separated from each other by a "*".
        pairStar("hello") → "hel*lo"
        pairStar("xxyy") → "x*xy*y"
        pairStar("aaaa") → "a*a*a*a"*/
public class CodingBat278 {
    public static String pairStar(String str) {
        String s = "";
        int index = 0;
        if(index!=str.length()-1&&str.length()!=0&&
        str.charAt(index)==str.charAt(index+1)){
                s += str.charAt(index) + "*";
                index++;
                str = s + pairStar(str.substring(index));
        } else if (str.length()!=0){
            s += str.charAt(index);
            str = s + pairStar(str.substring(++index));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(pairStar("aaaa"));
    }
}
