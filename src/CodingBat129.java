/*Given a positive int n, return true if it contains a 1
        digit. Note: use % to get the rightmost digit, and /
        to discard the rightmost digit.
        hasOne(10) → true
        hasOne(22) → false
        hasOne(220) → false*/
public class CodingBat129 {
    public boolean hasOne(int n) {
        boolean bb = false;
        String str = String.valueOf(n);
        for (int i =0; i<=str.length()-1;i++){
            if(str.charAt(i)=='1'){
                bb = true;
                break;
            }
        }
        return bb;
    }
}
