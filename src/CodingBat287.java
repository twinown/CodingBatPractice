
/*Given a string and a non-empty substring sub, compute recursively the number of times that sub
        appears in the string, without the sub strings overlapping.
        strCount("catcowcat", "cat") → 2
        strCount("catcowcat", "cow") → 1
        strCount("catcowcat", "dog") → 0*/
public class CodingBat287 {
    public int strCount(String str, String sub) {
        int i = sub.length();
        if(str.length()>=i){
            if(str.startsWith(sub)){
                return strCount(str.substring(i),sub)+1;
            } else  return strCount(str.substring(1),sub);
        } else return 0;
    }
}
