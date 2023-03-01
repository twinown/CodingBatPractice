public class CodingBat246_VAZHNO_strtsWith_vmesto_sbstr {
    public static boolean equalIsNot(String str) {
        int isCount  = 0;
        int notCount  = 0;
        for (int i = 0;i<str.length();i++){
            if(str.startsWith("is", i)){
                isCount++;
            } else if(str.startsWith("not", i)){
                notCount++;
            }
        }
        return isCount==notCount;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notnot"));
    }
}
