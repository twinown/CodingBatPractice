
/*Given a string, return a string made of the first 2 chars (if present), however include first char
only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"*/
public class CodingBat23 {
    public static String startOz(String str) {
        if(str.length()>=2){
            if(str.startsWith("oz",0)){
                return "oz";
            } else if (str.charAt(1) =='z'){
                return "z";
            }else if(str.charAt(0) == 'o'){
                return "o";
            }
        }else return str;
        return "";
    }


    public static void main(String[] args) {
        System.out.println(startOz("o"));
    }
}
