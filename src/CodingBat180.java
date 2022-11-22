public class CodingBat180 {
    public String doubleChar(String str) {
        String ns = "";
        for(int i =0;i<str.length();i++){
            ns += str.charAt(i)+str.substring(i,i+1);
        }
        return ns;
    }

}
