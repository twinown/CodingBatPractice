/*Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
        allStar("hello") → "h*e*l*l*o"
        allStar("abc") → "a*b*c"
        allStar("ab") → "a*b"*/
public class CodingBat277 {
    public static String allStar(String str) {
        String s = "";
        int index = 0;
        if(index!=str.length()-1&&str.length()!=0){
            s += str.charAt(index) + "*";
            index++;
           str =  s + allStar(str.substring(index));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(allStar(""));
    }
}
