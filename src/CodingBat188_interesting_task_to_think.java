public class CodingBat188_interesting_task_to_think {

    //long_solution
    public static String mixString(String a, String b) {
        String ns = "";
        int small = Math.min(a.length(), b.length());
        if(a.length()==0){
            ns = b;
        } else if(b.length()==0){
            ns = a;
        }
        for (int i = 0; i < small; i++) {
            if (a.length() > b.length()) {
                ns = ns + a.charAt(i) + b.charAt(i) ;
                if(ns.length()==b.length()*2){
                    ns = ns + a.substring(b.length());
                }
            } else if (a.length() < b.length()) {
                ns = ns + a.charAt(i) + b.charAt(i);
                if(ns.length()==a.length()*2){
                    ns = ns + b.substring(a.length());
                }
            } else ns = ns + a.charAt(i) + b.charAt(i);

        }
        return ns;
    }

    //smarter and shorter solution
   /* public String mixString(String a, String b) {
        String ns = "";
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i <= a.length()-1){
                ns += a.substring(i,i+1);
            }
            if (i <= b.length()-1){
                ns += b.substring(i,i+1);
            }
        }
        return ns;
    }*/

}
