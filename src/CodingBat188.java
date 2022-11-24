public class CodingBat188 {
    public static String mixString(String a, String b) {
        String ns = "";
        int small = Math.min(a.length(), b.length());
        for (int i = 0; i < small; i++) {
            if (a.length() > b.length()) {
                ns = ns + a.charAt(i) + b.charAt(i) ;
                if(ns.length()==a.length()+b.length()){
                    ns = ns + a.substring(a.length()-(a.length()-b.length()));
                }
            } else if (b.length() > a.length()) {
                ns = ns + a.charAt(i) + b.charAt(i);
                if(ns.length()==a.length()+b.length()){
                    ns = ns + b.substring(b.length()-(a.length()-b.length()));
                }
            } else ns = ns + a.charAt(i) + b.charAt(i);

        }
        return ns;
    }


    public static void main(String[] args) {
        System.out.println(mixString("Hi", "There"));
    }
}
