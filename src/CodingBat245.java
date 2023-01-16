import java.util.Locale;

/*
Given two strings, base and remove, return a version of the base
        string where all instances of the remove string have been
        removed (not case sensitive). You may assume that the remove
        string is length 1 or more. Remove only non-overlapping instances,
        so with "xxx" removing "xx" leaves "x".
        withoutString("Hello there", "llo") → "He there"
        withoutString("Hello there", "e") → "Hllo thr"
        withoutString("Hello there", "x") → "Hello there"*/
public class CodingBat245 {
    public static String withoutString(String base, String remove) {
        String s = base;
        for (int i = 0;i<base.length()-remove.length();i++){
            String substring1 = base.substring(i, i + remove.length());
            if(substring1.equalsIgnoreCase(remove)){
                s = s.replace(substring1,"");
                ;
            }
        }
        return s;
    }
}
