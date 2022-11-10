
public class CodingBat160 {
    public static int last2(String str) {
        int count = 0;
        if (str.length()>1){
            String ss = str.substring(str.length()-2);
            for(int i = 0; i<=str.length()-3; i++){
                if(str.substring(i,i+2).equals(ss)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(last2("a"));
    }
}
