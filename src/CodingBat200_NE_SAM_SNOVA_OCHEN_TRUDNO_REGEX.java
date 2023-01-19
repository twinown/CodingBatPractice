/*Given a string and a non-empty word string, return a string made of each char just before and
        just after every appearance of the word in the string. Ignore cases where there is
        no char before or after the word, and a char may be included twice if it is between two words.
        wordEnds("abcXY123XYijk", "XY") → "c13i"
        wordEnds("XY123XY", "XY") → "13"
        wordEnds("XY1XY", "XY") → "11"*/
public class CodingBat200_NE_SAM_SNOVA_OCHEN_TRUDNO_REGEX {
    public static String wordEnds(String str, String word) {
   /*     String ns = "";
        str = str.replace(word, "*");
        for (int i = 0; i <=str.length()-1; i++) {
            if (str.length()==1){
                ns = "";
                break;
            } else if (str.charAt(i)==str.charAt(i+1)){
                ns = word;
                break;
            } else if (str.charAt(i)=='*'&&i==0){
                ns  += str.substring(i+1, i+2);
                if (str.charAt(str.length()-1)=='*'){
                    ns +=  str.charAt(str.length()-2);
                }
            }else if (str.charAt(i)=='*'&&i==str.length()-1){
                  ns  += str.substring(i-1);
              } else if (str.charAt(i)=='*'){
                  ns  += str.substring(i-1,i+2);
              }
        }
        ns =ns.replace("*", "");
        return  ns;*/
        return str.replaceAll(".*?(?=" + word + ")(?<=(.|^))" + word + "(?=(.|$))|.+", "$1$2");
    }
    public static void main(String[] args) {
        System.out.println(wordEnds("XY", "XY"));
    }
}
