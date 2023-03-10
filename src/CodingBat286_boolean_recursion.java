public class CodingBat286_boolean_recursion {
    public static boolean nestParen(String str) {
        if (str.length()==0){
            return true;
        }
        if(str.charAt(0)=='('&&str.charAt(str.length()-1)==')'){
            return  nestParen(str.substring(1,str.length()-1));
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(nestParen("((()))"));
    }
}
