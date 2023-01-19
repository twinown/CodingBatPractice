
/*Given a string and a non-negative int n, we'll say that the front of the string is the
        first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"*/
public class CodingBat155 {
    public String frontTimes(String str, int n) {
        String res = "";
        for(int i = 1; i<= n;i++){
            if(str.length()>=3){
                res+=str.substring(0, 3);
            } else res+=str;
        }
        return res;
    }

}
