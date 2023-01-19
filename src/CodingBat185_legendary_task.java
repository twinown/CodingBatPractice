
/*Return true if the given string contains an appearance of "xyz" where the xyz is
        not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true*/
public class CodingBat185_legendary_task {
    public boolean xyzThere(String str) {
            boolean b = true;
            for (int i = 1; i <=str.length()-3; i++) {
                b = true;
                if (str.charAt(i)=='x'&&str.charAt(i+1)=='y'&&str.charAt(i+2)=='z'&&
                        str.charAt(i-1)=='.'){
                    b = false;
                }
            }
            if(!str.contains("xyz")){
                b = false;
            }
            return b;
        }
}
