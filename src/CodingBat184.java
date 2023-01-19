public class CodingBat184 {
    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase())
                ||
                b.toLowerCase().endsWith(a.toLowerCase());
    }

}
