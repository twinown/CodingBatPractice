public class CodingBat284_USE_REPLACE_WHEN_HARD_WITH_STRING {
    public static int countHi2(String str) {
        str = str.replace("xhi", "");
        if (str.length()>=2) {
            if (str.startsWith("hi")) {
                return countHi2(str.substring(2)) + 1;
            }
        }else return 0;
        return  countHi2(str.substring(1));
        //это моё решение . но оставлю топовое
           /* if(str.length()>=3){
                if(str.charAt(0)!='x'&&str.startsWith("hi",1)){
                    return countHi2(str.substring(3))+1;
                }else if(str.startsWith("hi")){
                    return countHi2(str.substring(2))+1;
                } else if(str.charAt(1)=='h'&&str.charAt(2)=='i') {
                    return countHi2(str.substring(3));
                }
            } else if (str.startsWith("hi")){
                return countHi2(str.substring(1)) + 1;
        } else return 0;
        return  countHi2(str.substring(1));*/
    }

    public static void main(String[] args) {
        System.out.println(countHi2("xhixhi"));
    }
}
