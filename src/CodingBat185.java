public class CodingBat185 {
    public boolean xyzThere(String str) {
        boolean b = false;
        if (str.contains(".x")){
            if (str.contains("xyz")){
                b = true;
            }
        } else b = true;
        return b;
    }

}
